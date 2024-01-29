package com.example.pizzaapp.model

import com.example.pizzaapp.model.ToppingPlacement.Left
import com.example.pizzaapp.model.ToppingPlacement.Right
import com.example.pizzaapp.model.ToppingPlacement.All

@Parcelize
data class Pizza (
    val toppings: Map<Topping, ToppingPlacement> = emptyMap()
) : Parcelable {
    val price : Double
        get() = 1000.0 + toppings.asSequence()
            .sumOf { (_, toppingPlacement) ->
                when(toppingPlacement) {
                    Left, Right -> 0.5
                    All -> 1.0
                }
            }

    fun withTopping(topping: Topping, placement: ToppingPlacement?) : Pizza {
        return copy(
            toppings = if (placement == null){
                toppings - topping
            } else {
                toppings + (topping to placement)
            }
        )
    }
}
package com.example.pizzaapp.model

import androidx.annotation.StringRes
import com.example.pizzaapp.R

enum class Topping (
    @StringRes val toppingName: Int
){
    Basil(
        toppingName = R.string.topping_basil
    ),
    Mushroom(
        toppingName = R.string.topping_mushrooms
    ),
    Olive(
        toppingName = R.string.topping_olive
    ),
    Pepperoni(
        toppingName = R.string.topping_pepperoni
    ),
    Peppers(
        toppingName = R.string.topping_peppers
    ),
    Pineapple(
        toppingName = R.string.topping_pineapples
    )
}
package com.jjoaooliveira.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val name: Int,
    @StringRes val heroDescription: Int,
    @DrawableRes val heroImage: Int
)

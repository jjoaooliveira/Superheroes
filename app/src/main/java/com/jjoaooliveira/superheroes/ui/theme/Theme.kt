package com.jjoaooliveira.superheroes.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors

private val DarkColorScheme = darkColors(
    background = dark_background,
    surface = dark_surface,
    onSurface = dark_onSurface,
    primary = dark_primary,
    onPrimary = dark_onPrimary,
    secondary = dark_secondary
)

private val LightColorScheme = lightColors(
    background = light_background,
    surface = light_surface,
    onSurface = light_onSurface,
    primary = light_primary,
    onPrimary = light_onPrimary,
    secondary = light_secondary
)

@Composable
fun SuperheroesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if(darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
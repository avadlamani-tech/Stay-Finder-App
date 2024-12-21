package com.example.stayfinder

import androidx.annotation.DrawableRes

data class OnboardingData(
    @DrawableRes val val_imageResID: Int,
    val title: String,
    val description: String,
    val button: String

)


val onboardingScreens = listOf(
    OnboardingData(
        val_imageResID = R.drawable.ic_launcher_background,
        title = "Discover Stays That Inspire",
        description = " Happy",
        button = "Next"

    ),OnboardingData(
        val_imageResID = R.drawable.ic_launcher_background,
        title = " like it that way",
        description = "Just Won",
        button = "Next"
    ),
    OnboardingData(
        val_imageResID = R.drawable.ic_launcher_background,
        title = "Having Fun!",
        description = "You too",
        button = "Start"
    )
)
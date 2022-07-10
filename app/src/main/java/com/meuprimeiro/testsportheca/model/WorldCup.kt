package com.meuprimeiro.testsportheca.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WorldCup(
    val max: Double,
    val pla: Double,
    val pos: Double
) : Parcelable
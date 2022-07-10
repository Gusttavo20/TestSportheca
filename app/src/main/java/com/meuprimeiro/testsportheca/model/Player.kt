package com.meuprimeiro.testsportheca.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Player(
    val img: String,
    val name: String,
    @SerializedName("percentual")
    val percentage: Double,
    val pos: String,
    val country: String,
    @SerializedName("Barras")
    val bars: Bars?
) : Parcelable
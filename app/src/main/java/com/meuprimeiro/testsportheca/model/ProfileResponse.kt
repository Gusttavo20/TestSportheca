package com.meuprimeiro.testsportheca.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProfileResponse(
    @SerializedName("Status")
    val status: Int,
    @SerializedName("Object")
    val response: List<Player>
) : Parcelable
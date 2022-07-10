package com.meuprimeiro.testsportheca.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Bars(
    @SerializedName("Copas_do_Mundo_Vencidas")
    val worldCupsWon : WorldCup,
    @SerializedName("Copas_do_Mundo_Disputadas")
    val worldCupsDisputed: WorldCup,
) : Parcelable
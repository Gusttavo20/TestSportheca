package com.meuprimeiro.testsportheca.datasource

import android.content.Context
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.meuprimeiro.testsportheca.model.Bars
import com.meuprimeiro.testsportheca.model.Player
import com.meuprimeiro.testsportheca.model.ProfileResponse
import java.io.IOException

class ProfileLocalDataSource(
    private val context: Context
): ProfileDataSource {
    override suspend fun getProfile(): ProfileResponse? {
        return try {
            val jsonString = context.assets.open("profile.json").bufferedReader().use { it.readText() }
            Gson().fromJson(jsonString, ProfileResponse::class.java)
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            null
        }
    }
}
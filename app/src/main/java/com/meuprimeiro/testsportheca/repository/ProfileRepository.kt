package com.meuprimeiro.testsportheca.repository

import com.meuprimeiro.testsportheca.model.ProfileResponse

interface ProfileRepository {
    suspend fun getProfile(): ProfileResponse?
}
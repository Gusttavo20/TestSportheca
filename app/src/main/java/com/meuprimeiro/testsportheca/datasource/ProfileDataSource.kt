package com.meuprimeiro.testsportheca.datasource

import com.meuprimeiro.testsportheca.model.ProfileResponse

interface ProfileDataSource {
    suspend fun getProfile(): ProfileResponse?
}
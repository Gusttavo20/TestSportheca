package com.meuprimeiro.testsportheca.usecase

import com.meuprimeiro.testsportheca.model.ProfileResponse

interface GetProfileUseCase {
    suspend fun getProfile(): ProfileResponse?
}
package com.meuprimeiro.testsportheca.usecase

import com.meuprimeiro.testsportheca.model.ProfileResponse
import com.meuprimeiro.testsportheca.repository.ProfileRepository

class GetProfileUseCaseImpl(
    private val profileRepository: ProfileRepository
): GetProfileUseCase {
    override suspend fun getProfile(): ProfileResponse? {
        return profileRepository.getProfile()
    }
}
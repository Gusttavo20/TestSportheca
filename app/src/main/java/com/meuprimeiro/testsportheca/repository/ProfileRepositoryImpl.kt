package com.meuprimeiro.testsportheca.repository

import com.meuprimeiro.testsportheca.datasource.ProfileDataSource
import com.meuprimeiro.testsportheca.model.ProfileResponse

class ProfileRepositoryImpl(
    private val profileDataSource: ProfileDataSource
): ProfileRepository {
    override suspend fun getProfile(): ProfileResponse? {
        val test = profileDataSource.getProfile()
        return test
    }
}
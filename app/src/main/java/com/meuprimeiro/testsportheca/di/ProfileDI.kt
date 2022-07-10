package com.meuprimeiro.testsportheca.di

import com.meuprimeiro.testsportheca.datasource.ProfileDataSource
import com.meuprimeiro.testsportheca.datasource.ProfileLocalDataSource
import com.meuprimeiro.testsportheca.repository.ProfileRepository
import com.meuprimeiro.testsportheca.repository.ProfileRepositoryImpl
import com.meuprimeiro.testsportheca.ui.ProfileViewModel
import com.meuprimeiro.testsportheca.usecase.GetProfileUseCase
import com.meuprimeiro.testsportheca.usecase.GetProfileUseCaseImpl
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val profileModule = module {
    viewModel { ProfileViewModel(get()) }
    single<GetProfileUseCase> { GetProfileUseCaseImpl(get()) }
    single<ProfileRepository> { ProfileRepositoryImpl(get()) }
    single<ProfileDataSource> { ProfileLocalDataSource(androidContext()) }
}
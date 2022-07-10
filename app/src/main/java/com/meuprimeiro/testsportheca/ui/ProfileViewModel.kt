package com.meuprimeiro.testsportheca.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.meuprimeiro.testsportheca.model.Player
import com.meuprimeiro.testsportheca.usecase.GetProfileUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProfileViewModel(
    private val getProfileUseCase: GetProfileUseCase
): ViewModel() {

    private val _profile = MutableLiveData<Player>()

    val profile: LiveData<Player>
        get() = _profile

    init {
        getProfile()
    }

    private fun getProfile() {
        viewModelScope.launch(Dispatchers.IO) {
            val profileResponse = getProfileUseCase.getProfile()
            profileResponse?.let {
                _profile.postValue(it.response[0])
            }
        }
    }
}
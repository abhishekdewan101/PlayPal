package com.adewan.playpal.features

import com.adewan.playpal.features.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureModule = module {
    viewModel { LoginViewModel(get()) }
}

package com.adewan.playpal

import com.google.firebase.auth.FirebaseAuth
import org.koin.dsl.module

val applicationModule = module {
    single { FirebaseAuth.getInstance() }
}

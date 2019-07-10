package com.cryptox.demo.core.di

import com.cryptox.demo.core.navigation.Navigator
import com.cryptox.demo.core.network.RetrofitAdapter
import org.koin.dsl.module


val coreModule = module {

    single { RetrofitAdapter() }
    single { Navigator() }
}

val appModules = listOf(coreModule)
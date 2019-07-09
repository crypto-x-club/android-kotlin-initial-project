package com.cryptox.demo.core.di

import com.cryptox.demo.AndroidApplication
import com.cryptox.demo.core.di.viewmodel.ViewModelModule
import com.cryptox.demo.core.navigation.RouteActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, ViewModelModule::class])
interface ApplicationComponent {
    fun inject(application: AndroidApplication)
    fun inject(routeActivity: RouteActivity)

    // TODO inject modules with info
    //fun inject(identityFragment: IdentityFragment)
}

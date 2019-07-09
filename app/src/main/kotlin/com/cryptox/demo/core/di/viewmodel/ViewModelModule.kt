package com.cryptox.demo.core.di.viewmodel

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    // TODO binds Feature View Model
    /*@Binds
    @IntoMap
    @ViewModelKey(IdentitiesViewModel::class)
    abstract fun bindsIdentitiesViewModel(identitiesViewModel: IdentitiesViewModel): ViewModel

    ...
    */
}
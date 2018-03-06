package com.hadeso.moviedb.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.hadeso.moviedb.ui.discovery.DiscoveryViewModel
import com.hadeso.moviedb.viewmodel.MovieDBViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by 77796 on 05-Mar-18.
 */
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(DiscoveryViewModel::class)
    abstract fun bindUserViewModel(userViewModel: DiscoveryViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: MovieDBViewModelFactory): ViewModelProvider.Factory

}
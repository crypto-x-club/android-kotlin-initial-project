package com.cryptox.demo.core.navigation

import android.content.Context
import com.cryptox.demo.features.MainActivity
import javax.inject.Inject
import javax.inject.Singleton

class Navigator {

    fun showMain(context: Context) = context.startActivity(MainActivity.callingIntent(context))
}



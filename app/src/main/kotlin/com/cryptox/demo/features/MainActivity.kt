package com.cryptox.demo.features

import android.content.Context
import android.content.Intent
import com.cryptox.demo.core.platform.BaseActivity

class MainActivity : BaseActivity() {
    companion object {
        fun callingIntent(context: Context) = Intent(context, MainActivity::class.java)
    }

    override fun fragment() = MainFragment()
}

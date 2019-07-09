package com.cryptox.demo.core.platform

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.cryptox.demo.R.id
import com.cryptox.demo.R.layout
import com.cryptox.demo.core.extension.inTransaction
import kotlinx.android.synthetic.main.toolbar.*

/**
 * Base Activity class with helper methods for handling fragment transactions and back button
 * events.
 *
 * @see AppCompatActivity
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_layout)
        setSupportActionBar(toolbar as Toolbar?)
        addFragment(savedInstanceState)
    }

    override fun onBackPressed() {
        (supportFragmentManager.findFragmentById(
            id.fragmentContainer
        ) as BaseFragment).onBackPressed()
        super.onBackPressed()
    }

    private fun addFragment(savedInstanceState: Bundle?) =
        savedInstanceState ?: supportFragmentManager.inTransaction {
            add(
                id.fragmentContainer, fragment()
            )
        }

    abstract fun fragment(): BaseFragment
}

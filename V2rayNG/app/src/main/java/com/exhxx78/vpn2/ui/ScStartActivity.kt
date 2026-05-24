package com.exhxx78.vpn2.ui

import android.os.Bundle
import com.exhxx78.vpn2.R
import com.exhxx78.vpn2.core.CoreServiceManager

class ScStartActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        moveTaskToBack(true)

        setContentView(R.layout.activity_none)

        if (!CoreServiceManager.isRunning()) {
            CoreServiceManager.startVServiceFromToggle(this)
        }
        finish()
    }
}


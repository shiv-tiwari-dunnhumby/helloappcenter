package com.example.shivendratiwari.helloappcenter

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.microsoft.appcenter.espresso.Factory
import com.microsoft.appcenter.espresso.ReportHelper
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import android.R.attr.label
import org.junit.After

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class AutomatedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.shivendratiwari.helloappcenter", appContext.packageName)
    }

    @Test
    fun useAppContext_mistake() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.shivendratiwari.helloappcenter_new", appContext.packageName)
    }
}

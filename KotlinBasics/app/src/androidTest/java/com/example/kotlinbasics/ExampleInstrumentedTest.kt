package com.example.kotlinbasics

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.kotlinbasics", appContext.packageName)
    }
   // example fro instrumentational test
//   class CalculatorTests {
//
//       @get:Rule()
//       val activity = ActivityScenarioRule(MainActivity::class.java)
//
//       @Test
//       fun calculate_20_percent_tip() {
//           onView(withId(R.id.cost_of_service_edit_text))
//               .perform(typeText("50.00"))
//
//           onView(withId(R.id.calculate_button)).perform(click())
//
//           onView(withId(R.id.tip_result))
//               .check(matches(withText(containsString("$10.00"))))
//       }
//   }
}
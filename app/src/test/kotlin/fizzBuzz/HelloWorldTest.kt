/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package fizzBuzz

import greetings.App
import kotlin.test.Test
import kotlin.test.assertNotNull

class HelloWorldTest {
    @Test fun appHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
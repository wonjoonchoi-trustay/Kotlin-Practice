package practice

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q16Test {

    @Test
    fun singletonLogger() {
        val Logger1 = Logger
        val Logger2 = Logger

        assertTrue(Logger1 === Logger2)
        assertEquals("[LOG] Test Message", Logger.logStr("Test Message"))
    }
}
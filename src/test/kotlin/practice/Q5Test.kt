package practice

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Q5Test {

    private val parser = ExceptionExample3()

    @Test
    fun parseSuccess() {
        assertEquals(
            123,
            parser.parseIntOrThrow("123")
        )
    }

    @Test
    fun parseFailure() {
        assertFailsWith<NumberFormatException> {
            parser.parseIntOrThrow("not a number")
        }
    }
}
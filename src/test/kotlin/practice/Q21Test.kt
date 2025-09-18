package practice

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Q21Test {

    @Test
    fun testTypeUtil() {
        val str: Any = "Hello"
        val num: Any = 123

        assertTrue(str.isInstanceOf<String>())
        assertFalse(str.isInstanceOf<Int>())

        assertTrue(num.isInstanceOf<Int>())
        assertFalse(num.isInstanceOf<String>())
    }
}
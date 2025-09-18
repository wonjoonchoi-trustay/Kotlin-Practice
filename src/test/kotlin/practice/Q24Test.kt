package practice

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Q24Test {

    @Test
    fun testDivide() {

        assertEquals(25, 50.divide2(2))
        assertEquals(0, 50.divide2(0))
    }
}
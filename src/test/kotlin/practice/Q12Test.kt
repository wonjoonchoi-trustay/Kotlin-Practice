package practice

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q12Test {

    @Test
    fun applyOperation_square() {
        val result = HigherOrderExample.applyOperation(5) { it * it }
        assertEquals(25, result)
    }

    @Test
    fun applyOperation_add100() {
        val result = HigherOrderExample.applyOperation(10) { it + 100 }
        assertEquals(110, result)
    }

}
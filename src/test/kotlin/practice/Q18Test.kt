package practice

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q18Test {

    @Test
    fun testGetPositiveOrNull() {
        assertEquals(5, NumberUtil2.getPositiveOrNull(5))
        assertNull(NumberUtil2.getPositiveOrNull(-5))
        assertNull(NumberUtil2.getPositiveOrNull(null))
    }

    @Test
    fun testGetNegativeOrNull() {
        assertEquals(-5, NumberUtil2.getNegativeOrNull(-5))
        assertNull(NumberUtil2.getNegativeOrNull(5))
        assertNull(NumberUtil2.getNegativeOrNull(null))
    }

}
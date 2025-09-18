package practice

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Q23Test {

    @Test
    fun testTransformAndFilter() {
        val original = listOf("  aAa ", " ", "Bbb ", "", " cCc ")
        val expected = listOf("AAA", "BBB", "CCC")

        assertEquals(expected, original.transformAndFilter())
    }
}
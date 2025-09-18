package practice

import kotlin.test.Test
import kotlin.test.assertEquals

class Q20Test {

    @Test
    fun testFilterAndUppercase() {
        val original = listOf("hi", "hello", "kotlin", "AI")
        val result = listOf("HELLO", "KOTLIN")

        assertEquals(result, original.filterAndUppercase(3))
    }

}
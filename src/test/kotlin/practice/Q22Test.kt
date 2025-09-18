package practice

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Q22Test {
    private val util = GenericUtil()

    @Test
    fun testGenericUtil() {
        val original = listOf("Apple", "Banana", "Cherry")
        val result = "Cherry"
        assertEquals(result, util.max(original))
    }

    @Test
    fun testGenericUtil2() {
        val original = listOf(1, 3, 2, 5, 4)
        val result = 5
        assertEquals(result, original.maxOrThrow())
    }
}
package practice

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q15Test {

    private val advanced = CollectionAdvanced()

    @Test
    fun groupNamesByFirstLetter() {
        val names = listOf("Alice", null, "Bob", "Anna", "Charlie", null)

        var result = advanced.groupNamesByFirstLetter(names)

        assertEquals(3, result.size)
        assertTrue(result.containsKey("A"))
        assertTrue(result.containsKey("B"))
        assertTrue(result.containsKey("C"))

        assertEquals(2, result["A"]?.size)
        assertEquals(1, result["B"]?.size)
        assertEquals(1, result["C"]?.size)
    }

}
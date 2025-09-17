package practice

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q10Test {
    private val collectionExample = CollectionExample3()
    val input = listOf("AA", "BB", "AC", "BC")
    val result = listOf("AA", "AC")

    @Test
    fun checkGetNamesStartingWithA() {
        assertEquals(result, collectionExample.getNamesStartingWithA(input))
    }
}
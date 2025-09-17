package practice

import kotlin.test.Test
import kotlin.test.assertEquals

class Q4Test {

    private val loop = LoopExampleTest()

    @Test
    fun printNumbersTest() {
        assertEquals(
            """
               1
               2
               3
               4
               5
            """.trimIndent(),
            loop.printNumbers()
        )
    }

    @Test
    fun printNumbersReverseTest() {
        assertEquals(
            """
                5
                4
                3
                2
                1
            """.trimIndent(),
            loop.printNumbersReverse()
        )
    }

    @Test
    fun printEvenNumbers() {
        assertEquals(
            """
                2
                4
                6
                8
                10
            """.trimIndent(),
            loop.printEvenNumbers()
        )
    }
}
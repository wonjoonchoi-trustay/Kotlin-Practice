package practice

import kotlin.test.Test
import kotlin.test.assertEquals

class Q6Test {
    private val functionExample = FunctionExample3()

    @Test
    fun repeat1() {
        assertEquals(
            """
                Hi
                Hi
                Hi
                Hi
            """.trimIndent(),
            functionExample.repeatPrint("Hi", 4, true)
        )
    }

    @Test
    fun repeat2() {
        assertEquals("HiHi", functionExample.repeatPrint("Hi",2,false))
    }

    @Test
    fun repeat3() {
        assertEquals(
            """
                Hello
                Hello
                Hello
            """.trimIndent(),
            functionExample.repeatPrint("Hello")
        )
    }
}
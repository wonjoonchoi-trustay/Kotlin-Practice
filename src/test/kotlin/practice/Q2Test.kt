package practice

import kotlin.test.Test
import kotlin.test.assertEquals

class Q2Test {

    private val greeting = Greeting()

    @Test
    fun testSayHelloWithNull() {
        assertEquals("Hello, Stranger", greeting.sayHello(null))
    }

    @Test
    fun testSayHelloWithName() {
        assertEquals("Hello, Won Joon", greeting.sayHello("Won Joon"))
    }
}
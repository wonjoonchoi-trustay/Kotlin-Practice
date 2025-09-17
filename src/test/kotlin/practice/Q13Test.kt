package practice

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Q13Test {

    @Test
    fun getValidNameUpperCase() {
        var user = User("Won Joon")
        assertEquals("WON JOON", user.getNameUpperCase())
    }

    @Test
    fun getInvalidNameUpperCase() {
        var user = User(null)
        assertEquals("Unknown", user.getNameUpperCase())
    }

}
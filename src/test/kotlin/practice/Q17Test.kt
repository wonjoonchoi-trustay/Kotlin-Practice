package practice

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Q17Test {

    @Test
    fun checkCopyUser() {
        val original = User17("WonJoon", 33, "Seoul")
        val copy = original.copyWithNewCity("Busan")

        assertEquals(original.name, copy.name)
        assertEquals(original.age, copy.age)
        assertNotEquals(original.city, copy.city)
    }
}
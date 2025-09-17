package practice

import kotlin.test.Test
import kotlin.test.assertEquals

class Q14Test {

    @Test
    fun checkPersonInfo() {
        val p: PersonInfo = PersonInfo("Joon").apply {
            age = 20
            address = "Seoul"
        }

        assertEquals("Joon - 20 - Seoul", p.getInfo())
    }
}
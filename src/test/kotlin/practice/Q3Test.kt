package practice

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Q3Test {
    private val checker = DayChecker()
    private val checker2 = DayChecker2()

    @Test
    fun checkCorrectDay() {
        assertEquals("Monday", checker.checkDay(1))
        assertEquals("Tuesday", checker.checkDay(2))
    }

    @Test
    fun checkCorrectDay2() {
        assertEquals("Monday", checker2.checkDay(1))
        assertEquals("Tuesday", checker2.checkDay(2))
    }

    @Test
    fun checkCorrectDayEnum() {
        assertEquals("Wednesday", Day.from(3)?.displayName)
        assertEquals(null, Day.from(99)?.displayName)
    }
}
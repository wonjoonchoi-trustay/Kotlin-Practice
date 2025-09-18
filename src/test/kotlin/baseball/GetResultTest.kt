package baseball

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.Description

class GetResultTest {

    @Nested
    inner class GenerateRandom {
        @Test
        fun `generateRandom은 항상 3자리 숫자를 생성하고 중복이 없어야 한다`() {
            repeat(100) { // 여러 번 실행해서 랜덤성 확인
                val num = generateRandom()
                val str = num.toString()

                assertEquals(3, str.length, "반드시 3자리여야 한다")
                assertEquals(3, str.toSet().size, "중복된 숫자가 없어야 한다")

                // 1..9 범위 안인지 확인
                assertTrue(str.all { it in '1'..'9' }, "모든 숫자는 1~9 사이여야 한다")
            }
        }
    }


    @Nested
    inner class GetResult {
        @Test
        fun `3스트라이크 경우`() {
            val (balls, strikes) = getResult(123, 123)
            assertEquals(0, balls)
            assertEquals(3, strikes)
        }

        @Test
        fun `3볼 경우`() {
            val (balls, strikes) = getResult(123, 312)
            assertEquals(3, balls)   // 숫자는 같지만 자리 다름
            assertEquals(0, strikes)
        }

        @Test
        fun `낫싱 경우`() {
            val (balls, strikes) = getResult(123, 456)
            assertEquals(0, balls)
            assertEquals(0, strikes)
        }
    }


    @Nested
    inner class ResultMessage {
        @Test
        fun `낫싱을 반환`() {
            assertEquals("낫싱", resultMessage(0, 0))
        }

        @Test
        fun `볼과 스트라이크 모두 출력`() {
            assertEquals("1볼 2스트라이크", resultMessage(1, 2))
        }
    }
}
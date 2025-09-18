package practice

/*
🚀 열여덟 번째 문제 (고급 null 처리와 takeIf, takeUnless)

다음 Java 코드를 Kotlin으로 변환해 보세요.

public class NumberUtil {
    public static Integer getPositiveOrNull(Integer number) {
        if (number != null && number > 0) {
            return number;
        } else {
            return null;
        }
    }

    public static Integer getNegativeOrNull(Integer number) {
        if (number != null && number < 0) {
            return number;
        } else {
            return null;
        }
    }
}


👉 변환 시 고려사항:
Kotlin에서는 Int? 로 nullable 타입 처리
takeIf / takeUnless 를 사용해 조건부 반환
불필요한 if-else 줄이기
 */

class NumberUtil {
    companion object {
        fun getPositiveOrNull(number: Int?): Int? {
            return when {
                number != null && number >0 -> number
                else -> null
            }
        }

        fun getNegativeOrNull(number: Int?): Int? {
            return when {
                number != null && number < 0 -> number
                else -> null
            }
        }
    }
}

class NumberUtil2 {
    companion object {
        fun getPositiveOrNull(number: Int?): Int? = number?.takeIf { it > 0 }
        fun getNegativeOrNull(number: Int?): Int? = number?.takeIf { it < 0 }
    }
}
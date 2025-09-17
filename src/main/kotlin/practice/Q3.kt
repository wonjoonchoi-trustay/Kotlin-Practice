package practice

/*
🚀 세 번째 문제 (조건문과 when 표현식)

다음 Java 코드를 Kotlin 코드로 변환하세요.

public class DayChecker {
    public String checkDay(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid day";
        }
    }
}


👉 변환 시 고려사항:
when 표현식 사용
default 대신 else 활용
가능하다면 expression 스타일로 간결하게 작성
 */

class DayChecker {
    fun checkDay(day: Int) : String {
        return when (day) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid day"
        }
    }
}

class DayChecker2 {
    fun checkDay(day: Int) : String = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
}

enum class Day(val displayName: String) {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    companion object {
        fun from(day: Int): Day? = when(day) {
            1 -> MONDAY
            2 -> TUESDAY
            3 -> WEDNESDAY
            4 -> THURSDAY
            5 -> FRIDAY
            6 -> SATURDAY
            7 -> SUNDAY
            else -> null
        }
    }
}
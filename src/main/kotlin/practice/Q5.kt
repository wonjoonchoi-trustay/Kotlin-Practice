package practice

/*
🚀 다섯 번째 문제 (예외 처리와 try-catch, use 함수)
다음 Java 코드를 Kotlin으로 변환해 보세요.

public class ExceptionExample {
    public int parseIntOrZero(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}


👉 변환 시 고려사항:
try-catch 문법은 Java와 거의 같지만, Kotlin에서는 expression으로도 사용 가능
불필요한 return 줄이기
필요하다면 toIntOrNull() 과 Elvis 연산자 (?:) 사용해 더 코틀린스럽게 리팩토링 가능
 */

class ExceptionExample {
    fun parseIntOrZero(str: String): Int {
        return str.toIntOrNull() ?: return 0
    }
}

class ExceptionExample2 {
    fun parseIntOrZero(str: String): Int = str.toIntOrNull() ?: 0
}

class ExceptionExample3 {
    fun parseIntOrThrow(str: String): Int {
        return str.toIntOrNull() ?: throw NumberFormatException()
    }
}
package practice


/*
🚀 스물네 번째 문제 (예외 처리)

다음 Java 코드를 Kotlin으로 변환하세요.

public class Calculator {
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}


👉 변환 시 고려사항:
try-catch를 Kotlin 표현식으로 변환
함수는 expression body(=)로 작성 가능
더 Kotlin스럽게 runCatching 버전도 시도해볼 수 있음
 */

fun divide(a: Int, b: Int): Int =
    runCatching {
        a / b
    }.getOrElse { e ->
        println("${e.message}")
        0
    }

fun Int.divide2(b: Int): Int =
    runCatching {
        this / b
    }.getOrElse {
        0
    }
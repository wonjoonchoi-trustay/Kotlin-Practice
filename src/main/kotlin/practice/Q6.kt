package practice

/*
🚀 여섯 번째 문제 (Default Parameter, Named Argument, Vararg)

다음 Java 코드를 Kotlin으로 변환해 보세요.

public class FunctionExample {
    public void repeatPrint(String message, int num, boolean useNewLine) {
        for (int i = 0; i < num; i++) {
            if (useNewLine) {
                System.out.println(message);
            } else {
                System.out.print(message);
            }
        }
    }

    // Java에서는 오버로딩으로 기본값을 처리
    public void repeatPrint(String message, int num) {
        repeatPrint(message, num, true);
    }

    public void repeatPrint(String message) {
        repeatPrint(message, 3, true);
    }
}


👉 변환 시 고려사항:
Kotlin은 오버로딩 대신 기본 파라미터(default parameter) 사용 가능
특정 파라미터만 지정하려면 Named Argument 사용
문자열 여러 개를 출력하려면 Vararg 활용 가능
 */


class FunctionExample {
    fun repeatPrint(message: String, num: Int = 3, useNewLine: Boolean = true) {
        repeat(num) {
            if (useNewLine) println(message) else println(message)
        }
    }
}

class FunctionExample2 {
    fun repeatPrint(message: String, num: Int = 3, useNewLine: Boolean = true): String =
        buildString {
            repeat(num) {
                if (useNewLine) appendLine(message) else append(message)
            }
        }
}

class FunctionExample3 {
    fun repeatPrint(message: String, num: Int = 3, useNewLine: Boolean = true): String =
        if (useNewLine) {
            List(num) { message }.joinToString(separator = "\n")
        } else {
            List(num) { message }.joinToString("")
        }
}

fun main() {

}
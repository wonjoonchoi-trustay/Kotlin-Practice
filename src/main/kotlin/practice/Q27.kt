package practice

/*
🚀 스물일곱 번째 문제 (기본 파라미터와 Named Argument)

다음 Java 코드를 Kotlin으로 변환하세요.

public class Greeting {
    public String sayHello(String name, boolean uppercase) {
        if (uppercase) {
            return ("Hello, " + name).toUpperCase();
        } else {
            return "Hello, " + name;
        }
    }

    // Java에서는 오버로딩으로 기본값 처리
    public String sayHello(String name) {
        return sayHello(name, false);
    }
}


👉 변환 시 고려사항:
Kotlin에서는 default parameter 로 오버로딩 제거 가능
uppercase() 사용
호출 시 Named Argument로 uppercase = true 지정 가능
 */

class Greeting {
    fun sayHello(name: String, uppercase: Boolean = false): String =
        when {
            uppercase -> ("Hello, $name").uppercase()
            else -> "Hello, $name"
        }
}
package practice

/*
🚀 두 번째 문제 (Null Handling in Kotlin)

다음 Java 코드를 Kotlin스럽게 변환해보세요.

public class Greeting {
    public String sayHello(String name) {
        if (name == null) {
            return "Hello, Stranger!";
        } else {
            return "Hello, " + name;
        }
    }
}
👉 변환 시 고려사항:
nullable type (String?) 적용
Safe Call (?.) 또는 Elvis 연산자 (?:) 활용
불필요한 if-else 최소화
 */

class Greeting {
    fun sayHello(name: String?): String = "Hello, ${name ?: "Stranger"}"
}

class Greeting2 {
    fun sayHello(name: String?): String = if (name == null) "Hello, Stranger!" else "Hello, $name"
}

fun main() {
    val greeting = Greeting()
    println(greeting.sayHello(null))
    println(greeting.sayHello("Won Joon"))
}
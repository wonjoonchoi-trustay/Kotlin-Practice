package practice

/*
🚀 열여섯 번째 문제 (Object와 Singleton, Companion Object 활용)

다음 Java 코드를 Kotlin으로 변환해 보세요.

public class Logger {
    private static Logger instance = new Logger();

    private Logger() {}

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Logger.getInstance().log("Hello, Singleton!");
    }
}


👉 변환 시 고려사항:
Kotlin의 object 키워드를 활용하면 Singleton 패턴을 간단하게 구현 가능
companion object를 활용하면 클래스 단위의 static-like 멤버 제공 가능
 */

object Logger {
    fun log(message: String) {
        println("[LOG] $message")
    }

    fun logStr(message: String): String =
        "[LOG] $message"
}
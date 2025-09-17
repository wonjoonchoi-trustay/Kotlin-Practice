package practice

/*
🚀 아홉 번째 문제 (Data Class와 Sealed Class)

다음 Java 코드를 Kotlin으로 변환해 보세요.

// 결과(Result) 상태를 표현하는 클래스
public abstract class Result {
    private Result() {}

    public static final class Success extends Result {
        private final String data;
        public Success(String data) { this.data = data; }
        public String getData() { return data; }
    }

    public static final class Error extends Result {
        private final String message;
        public Error(String message) { this.message = message; }
        public String getMessage() { return message; }
    }
}


👉 변환 시 고려사항:
Kotlin의 sealed class 활용
Success, Error는 data class로 정의
when 표현식으로 분기 처리 시 exhaustiveness 보장
 */


sealed class Result {
    data class Success(val data: String): Result()
    data class Error(val message: String): Result()
}

fun handleResult(result: Result): String =
    when (result) {
        is Result.Success -> "Success with data: ${result.data}"
        is Result.Error -> "Error: ${result.message}"
    }

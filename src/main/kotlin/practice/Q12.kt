package practice

/*
🚀 열두 번째 문제 (고차 함수와 람다)

다음 Java 코드를 Kotlin으로 변환해 보세요.

import java.util.function.Function;

public class HigherOrderExample {
    public static int applyOperation(int x, Function<Integer, Integer> operation) {
        return operation.apply(x);
    }

    public static void main(String[] args) {
        int result1 = applyOperation(5, n -> n * n);
        int result2 = applyOperation(10, n -> n + 100);

        System.out.println(result1); // 25
        System.out.println(result2); // 110
    }
}

👉 변환 시 고려사항:
Kotlin에서는 고차 함수를 함수 타입 (Int) -> Int 으로 정의
람다는 { it * it }, { it + 100 } 형태로 표현
main 함수에서 호출해 테스트 가능
 */

class HigherOrderExample {
    companion object {
        fun applyOperation(x: Int, operation: (Int) -> Int): Int {
            return operation(x)
        }

        @JvmStatic
        fun main(args: Array<String>) {
            val result1 = applyOperation(5) { it * it }
            val result2 = applyOperation(10) { it + 100 }

            println(result1) // 25
            println(result2) // 110
        }
    }
}



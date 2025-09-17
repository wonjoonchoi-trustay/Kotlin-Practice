package practice

/*
🚀 네 번째 문제 (Kotlin 반복문 변환)
다음 Java 코드를 Kotlin으로 변환하세요.

public class LoopExample {
    public void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersReverse() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public void printEvenNumbers() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}


👉 변환 시 고려사항:
Kotlin의 for (i in 1..5) / downTo / step 활용
println() 사용
가능하다면 간결하게 expression 스타일로 작성
 */

class LoopExample {
    fun printNumbers() {
        for (i in 1..5) {
            println(i)
        }
    }

    fun printNumbersReverse() {
        for (i in 5 downTo 1) {
            println(i)
        }
    }

    fun printEvenNumbers() {
        for (i in 2..10 step 2) {
            println(i)
        }
    }
}

class LoopExampleTest {
    fun printNumbers(): String = (1..5).joinToString("\n")
    fun printNumbersReverse(): String = (5 downTo 1).joinToString("\n")
    fun printEvenNumbers(): String = (2..10 step 2).joinToString("\n")
}
package practice

/*
🚀 스물여섯 번째 문제 (컬렉션과 람다)

다음 Java 코드를 Kotlin으로 변환하세요.

import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter {
    public List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}


👉 변환 시 고려사항:
Kotlin 컬렉션의 filter 함수 사용
간결하게 expression body(=) 활용
반환 타입은 List<Int>
 */

fun List<Int>.getEvenNumbers(): List<Int> =
    filter { it % 2 == 0 }





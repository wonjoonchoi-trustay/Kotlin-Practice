package practice

/*
🚀 서른한 번째 문제 (컬렉션 API + 고차 함수)

다음 Java 코드를 Kotlin으로 변환하세요.

import java.util.*;
import java.util.stream.Collectors;

public class NameUtil {
    public static List<String> filterAndSort(List<String> names) {
        return names.stream()
                .filter(name -> name.length() > 3)
                .sorted()
                .collect(Collectors.toList());
    }
}


👉 변환 시 고려사항:
Kotlin의 filter 와 sorted 함수 사용
간결한 expression body 활용 (=)
List<String> 반환
 */

fun List<String>.filterAndSort(): List<String> = filter { it.length > 3 }.sorted()


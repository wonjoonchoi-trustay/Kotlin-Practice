package practice

import jdk.internal.org.jline.utils.Colors.s

/*
🚀 스물세 번째 문제 (고차 함수 + 확장 함수 조합)

다음 Java 코드를 Kotlin으로 변환해 보세요.

import java.util.List;
import java.util.stream.Collectors;

public class TransformUtil {
    public static List<String> transformAndFilter(List<String> input) {
        return input.stream()
                .map(s -> s.trim())
                .filter(s -> !s.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}


👉 변환 시 고려사항:

Kotlin 확장 함수로 List<String>.transformAndFilter(): List<String> 작성

map, filter, map 조합을 함수형 스타일로 구현

trim() + isNotEmpty() + uppercase() 활용
 */


class TransformUtil {
    fun transformAndFilter(input: List<String>): List<String> {
        return input
            .map { it -> it.trim() }
            .filter { s -> !s.isEmpty() }
            .map { it -> it.uppercase() }
    }
}

fun List<String>.transformAndFilter(): List<String> =
    this.map { it -> it.trim() }
        .filter { s -> !s.isEmpty() }
        .map { it -> it.uppercase() }
package practice

/*
🚀 스무 번째 문제 (람다와 확장 함수 결합)

다음 Java 코드를 Kotlin으로 변환해 보세요.

import java.util.List;
import java.util.stream.Collectors;

public class StringUtil {
    public static List<String> filterAndUppercase(List<String> input, int minLength) {
        return input.stream()
                .filter(s -> s.length() >= minLength)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}


👉 변환 시 고려사항:
확장 함수로 List<String>.filterAndUppercase(minLength: Int): List<String> 작성
filter + map 조합 활용
uppercase() 함수 사용
간결하게 expression 스타일로 작성
 */



class StringUtil {
    companion object {
        fun filterAndUppercase(input: List<String>, minLength: Int): List<String> {
            return input
                .filter{ it.length >= minLength }
                .map { it.uppercase() }
        }
    }
}

fun List<String>.filterAndUppercase(minLength: Int): List<String> =
    this.filter { it.length >= minLength }
        .map { it.uppercase() }
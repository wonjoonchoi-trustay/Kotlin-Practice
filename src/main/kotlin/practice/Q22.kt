package practice

/*
🚀 스물두 번째 문제 (제네릭 & 타입 제약)

다음 Java 코드를 Kotlin으로 변환해 보세요.

import java.util.List;

public class GenericUtil {
    public static <T extends Comparable<T>> T max(List<T> items) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("List must not be empty");
        }
        T max = items.get(0);
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}


👉 변환 시 고려사항:
Kotlin의 fun <T : Comparable<T>> 문법 사용
require(items.isNotEmpty()) 로 리스트 검증
maxOrNull() 같은 표준 라이브러리를 활용해 더 간결히 리팩토링 가능
 */

class GenericUtil {
    fun <T: Comparable<T>> max(items: List<T>?): T {
        require(!items.isNullOrEmpty()) { throw IllegalArgumentException("List must not be empty") }

        var max = items.first()
        for (item in items) {
            if (item > max) {
                max = item
            }
        }
        return max
    }
}

fun <T : Comparable<T>> List<T>.maxOrThrow(): T =
    this.maxOrNull() ?: throw IllegalArgumentException("List must not be empty")

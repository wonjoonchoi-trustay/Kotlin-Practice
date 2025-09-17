package practice

/*
.

🚀 열 번째 문제 (컬렉션과 람다 활용)

다음 Java 코드를 Kotlin으로 변환해 보세요.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionExample {
    public List<String> getNamesStartingWithA(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}


👉 변환 시 고려사항:
Kotlin의 filter, map 등 컬렉션 고차함수 사용
메서드 참조 대신 람다 또는 String::uppercase 활용
간결한 표현식 스타일로 작성
 */

class CollectionExample {
    fun getNamesStartingWithA(names: Array<String>): Array<String> {
        val result = names.filter { it.startsWith('A') }.map {it.uppercase() }
        return result.toTypedArray()
    }
}

class CollectionExample2 {
    fun getNamesStartingWithA(names: Array<String>): Array<String> =
        names.filter { it.startsWith('A') }
            .map { it.uppercase() }
            .toTypedArray()
}

class CollectionExample3 {
    fun getNamesStartingWithA(names: List<String>): List<String> =
        names.filter { it.startsWith('A') }
            .map { it.uppercase() }
}

/*
// Array
val arr = arrayOf("A", "B", "C")
arr[1] = "X"                  // 가능
println(arr.joinToString())   // A, X, C

// List (불변)
val list = listOf("A", "B", "C")
// list[1] = "X"  // ❌ 컴파일 에러 (불변)

// MutableList
val mList = mutableListOf("A", "B", "C")
mList[1] = "X"                 // 가능
println(mList)                 // [A, X, C]
 */
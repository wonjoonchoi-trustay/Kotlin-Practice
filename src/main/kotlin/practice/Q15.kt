package practice

/*
🚀 열다섯 번째 문제 (Kotlin Collection API 심화 활용)

다음 Java 코드를 Kotlin으로 변환해 보세요.

import java.util.*;
import java.util.stream.Collectors;

public class CollectionAdvanced {
    public Map<String, List<String>> groupNamesByFirstLetter(List<String> names) {
        return names.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(name -> name.substring(0, 1)));
    }
}


👉 변환 시 고려사항:
filterNotNull() 또는 mapNotNull() 활용
groupBy { it.first().toString() } 사용
반환 타입은 Map<String, List<String>>
 */



class CollectionAdvanced {
    fun groupNamesByFirstLetter(names: List<String?>): Map<String, List<String>> {
        return names
            .filterNotNull()
            .groupBy { it.first().toString() }
    }
}
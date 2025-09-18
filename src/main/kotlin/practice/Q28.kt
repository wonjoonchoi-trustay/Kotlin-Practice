package practice

/*
스물여덟 번째 문제 (확장 함수 활용)

다음 Java 유틸리티 메서드를 Kotlin의 확장 함수로 변환하세요.

public class StringUtil {
    public static boolean isNullOrBlank(String str) {
        return str == null || str.trim().isEmpty();
    }
}


👉 변환 시 고려사항:
Kotlin에서는 String? 타입을 대상으로 확장 함수 작성 가능
isNullOrBlank() 는 사실 표준 라이브러리에 있지만, 학습을 위해 직접 구현
this?.trim()?.isEmpty() ?: true 패턴을 활용
 */

fun String?.isNullOrBlank(): Boolean = this == null || this.isBlank()


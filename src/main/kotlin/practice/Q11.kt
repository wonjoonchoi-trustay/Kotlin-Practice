package practice

/*
🚀 열한 번째 문제 (확장 함수 작성하기)

다음 Java 유틸리티 클래스를 Kotlin의 확장 함수로 변환해 보세요.

public class StringUtils {
    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
}


👉 변환 시 고려사항:
Kotlin에서는 String에 확장 함수를 직접 추가 가능
replace("\\s+".toRegex(), "") 사용 가능
reversed() 메서드 활용
 */

fun String.isPalindrome(): Boolean {
    val clean = this.replace("\\s+".toRegex(), "").lowercase()
    return clean == clean.reversed()
}
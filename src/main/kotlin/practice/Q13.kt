package practice

/*
🚀 열세 번째 문제 (Null 처리와 Safe Call, Elvis, let 활용)

다음 Java 코드를 Kotlin으로 변환해 보세요.

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getNameUpperCase() {
        if (name == null) {
            return "Unknown";
        } else {
            return name.toUpperCase();
        }
    }
}


👉 변환 시 고려사항:
name을 **nullable 타입(String?)**으로 선언
toUpperCase() 대신 Kotlin의 uppercase() 사용
?: (Elvis 연산자) 활용
가능하다면 let 블록을 이용한 표현도 시도
 */

data class User(
    val name: String?
) {
    fun getNameUpperCase(): String = name?.uppercase() ?: "Unknown"
}
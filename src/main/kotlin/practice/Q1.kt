package org.example.practice

/*
🚀 첫 번째 문제 (Lec 01 ~ 02 내용 기반)

다음 Java 코드를 Kotlin 코드로 변환해 보세요.
조건은 코틀린스럽게 (idiomatic) 작성하는 것입니다.

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return age >= 20;
    }
}


👉 변환 시 고려사항:

val / var 적절히 사용

custom getter 활용
불필요한 보일러플레이트 제거
 */

// DTO
data class Person(
    val name: String,
    val age: Int
) {
    val nameUpper : String
        get() = name.uppercase()

    val isAdult: Boolean
        get() = age >= 20
}

// Domain Entity
class Person2 (
    val name: String,
    val age: Int
) {
    fun getNameUpper() = name.uppercase()
    fun isAdult() = age >= 20
}

// PersonDto -> Person
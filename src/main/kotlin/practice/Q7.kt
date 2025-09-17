package practice

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

/*
🚀 일곱 번째 문제 (클래스와 생성자, init, custom getter, backing field)

다음 Java 코드를 Kotlin으로 변환해 보세요.

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 20;
    }

    public String getUpperCaseName() {
        return name.toUpperCase();
    }
}


👉 변환 시 고려사항:
주 생성자(primary constructor)와 init 블록을 활용해 나이 검증하기
isAdult는 함수 대신 custom getter 프로퍼티로 구현하기
getUpperCaseName도 custom getter 프로퍼티로 변환하기
 */

data class Person(val name:String, val age: Int) {
    init {
        require(age > 0) { throw IllegalArgumentException("Age must be positive") }
    }

    val isAdult: Boolean
        get() = age >= 0

    val upperCaseName: String
        get() = name.uppercase()
}

@Entity
class PersonEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var name: String,
    var age: Int
) {
    init {
        require(age > 0) { "Age must be positive" }
    }

    val isAdult: Boolean
        get() = age >= 0

    val upperCaseName: String
        get() = name.uppercase()
}

class PersonDto(
    val name: String,
    val age: Int,
)

fun PersonDto.toEntity(): PersonEntity = PersonEntity(name = this.name, age = this.age)
fun PersonEntity.toDto(): PersonDto = PersonDto(name = this.name, age = this.age)


fun main() {

}
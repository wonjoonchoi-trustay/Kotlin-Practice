package practice

import kotlin.run
import kotlin.with

/*
🚀 열네 번째 문제 (스코프 함수 활용)

다음 Java 코드를 Kotlin으로 변환해 보세요.

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name) {
        this.name = name;
    }

    public void initPerson() {
        this.age = 20;
        this.address = "Seoul";
    }

    public String getInfo() {
        return name + " - " + age + " - " + address;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Joon");
        p.initPerson();
        System.out.println(p.getInfo());
    }
}


👉 변환 시 고려사항:
apply를 사용하여 객체 초기화 간결화
with 또는 run을 활용하여 getInfo 출력
불필요한 initPerson() 제거 가능
 */


data class PersonInfo(
    val name: String,
    var age: Int? = null,
    var address: String? = null
) {
    fun getInfo(): String = "$name - $age - $address"
}

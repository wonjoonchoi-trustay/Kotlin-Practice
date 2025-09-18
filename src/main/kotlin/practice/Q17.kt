package practice

/*
🚀 열일곱 번째 문제 (Data Class와 copy 활용)

다음 Java 코드를 Kotlin으로 변환해 보세요.

public class User {
    private final String name;
    private final int age;
    private final String city;

    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public User copyWithNewCity(String newCity) {
        return new User(this.name, this.age, newCity);
    }

    @Override
    public String toString() {
        return name + " - " + age + " - " + city;
    }
}


👉 변환 시 고려사항:
Kotlin의 data class는 toString, equals, hashCode 자동 생성
copy() 메서드로 일부 프로퍼티만 변경 가능
val과 var를 적절히 선택
 */


data class User17(val name: String, val age: Int, val city: String) {

    fun copyWithNewCity(newCity: String): User17 = this.copy(city = newCity)

    override fun toString(): String = "$name - $age - $city"
}


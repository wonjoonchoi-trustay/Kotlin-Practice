package practice

/*
🚀 여덟 번째 문제 (상속과 인터페이스 활용)

다음 Java 코드를 Kotlin으로 변환해 보세요.

public interface Animal {
    void makeSound();
}

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

👉 변환 시 고려사항:
Kotlin의 interface와 class를 활용
생성자(primary constructor) 문법 활용
override 키워드 반드시 명시
테스트 시 listOf<Animal>() 컬렉션에 담아 다형성 확인 가능
 */


interface Animal {
    fun makeSound()
    fun makeSoundStr(): String
}

class Dog(val name: String) : Animal {
    override fun makeSound() {
        println("$name says: Woof!")
    }

    override fun makeSoundStr(): String = "$name says: Woof!"
}

class Cat(val name: String) : Animal {
    override fun makeSound() {
        println("$name says: Meow!")
    }

    override fun makeSoundStr(): String = "$name says: Meow!"
}

fun main() {
    val animals: List<Animal> = listOf(
        Dog("Doggy"),
        Cat("Kitten")
    )

    animals.forEach { it.makeSound() }
}
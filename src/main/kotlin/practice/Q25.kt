package practice

/*
🚀 스물다섯 번째 문제 (클래스와 생성자, init, custom getter)

다음 Java 코드를 Kotlin으로 변환하세요.

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price must not be negative");
        }
        this.name = name;
        this.price = price;
    }

    public String getDisplayName() {
        return name.toUpperCase() + " - " + price;
    }
}


👉 변환 시 고려사항:
primary constructor와 init 블록 활용
가격 유효성 검사에 require 사용
getDisplayName은 custom getter 프로퍼티로 구현
 */

data class Product(val name: String, val price: Int) {
    init {
        require(price >= 0) { throw IllegalArgumentException("Price must not be negative") }
    }

    fun getDisplayName(): String =
        name.uppercase() + " - " + price
}



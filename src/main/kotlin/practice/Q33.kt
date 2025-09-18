package practice

import java.io.BufferedReader
import java.io.FileReader
/*
🚀 서른세 번째 문제 (Data Class와 copy 활용)

다음 Java 코드를 Kotlin으로 변환하세요.

public class Book {
    private final String title;
    private final String author;
    private final double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book withDiscount(double discountRate) {
        return new Book(this.title, this.author, this.price * (1 - discountRate));
    }

    @Override
    public String toString() {
        return title + " by " + author + " - $" + price;
    }
}


👉 변환 시 고려사항:
data class 로 정의 → toString 자동 생성
copy() 활용해 할인된 가격을 적용한 새 객체 반환
함수형 스타일로 간결하게 작성
 */

data class Book (
    val title: String,
    val author: String,
    val price: Double
) {

    fun withDiscount(discountRate: Double): Book {
        return this.copy(price = this.price * (1 - discountRate))
    }

    override fun toString(): String =
        "$title by $author - $$price"
}

// 확장 함수
fun Book.withDiscount(discountRate: Double): Book {
    return this.copy(price = this.price * (1 - discountRate))
}
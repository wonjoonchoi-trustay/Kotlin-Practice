package practice

/*
🚀 스물아홉 번째 문제 (Sealed Class 활용)

다음 Java 코드를 Kotlin으로 변환하세요.

public abstract class Shape {
    private Shape() {}

    public static final class Circle extends Shape {
        private final double radius;
        public Circle(double radius) { this.radius = radius; }
        public double getRadius() { return radius; }
    }

    public static final class Rectangle extends Shape {
        private final double width;
        private final double height;
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        public double getWidth() { return width; }
        public double getHeight() { return height; }
    }
}


👉 변환 시 고려사항:

sealed class 로 정의

Circle, Rectangle 은 data class 로 구현

when 표현식에서 exhaustiveness 보장
 */

sealed class Shape {
    data class Circle(val radius: Double) : Shape()
    data class Rectangle(val width: Double, val height: Double) : Shape()
}

fun Shape.area(): Double =
    when (this) {
        is Shape.Circle -> Math.PI * this.radius * this.radius
        is Shape.Rectangle -> this.width * this.height
    }
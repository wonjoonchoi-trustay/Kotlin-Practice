package practice

/*
🚀 스물한 번째 문제 (Inline + Reified 타입 파라미터 활용)

다음 Java 코드를 Kotlin으로 변환해 보세요.

public class TypeUtil {
    public static <T> boolean isInstanceOf(Object obj, Class<T> clazz) {
        return clazz.isInstance(obj);
    }
}


👉 변환 시 고려사항:
Kotlin에서는 reified 타입 파라미터 + inline 함수를 활용하면 Class<T>를 넘기지 않고도 타입 검사가 가능
is T 연산자를 적극적으로 활용
함수 호출 시 TypeUtil.isInstanceOf<String>(obj) 같은 식으로 간단히 사용 가능
 */



class TypeUtil {
    companion object {
        fun <T> isInstanceOf(obj: Any, clazz: Class<T>): Boolean {
            return clazz.isInstance(obj)
        }
    }
}

inline fun <reified T> Any.isInstanceOf(): Boolean {
    return this is T
}
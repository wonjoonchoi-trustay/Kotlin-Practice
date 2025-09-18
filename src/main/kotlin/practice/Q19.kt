package practice


import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

/*
🚀 열아홉 번째 문제 (예외 처리 심화 - try, use, runCatching)

다음 Java 코드를 Kotlin으로 변환해 보세요.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {
    public static String readFirstLine(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return "Error: " + e.getMessage();
        }
    }
}

👉 변환 시 고려사항:
Kotlin의 use 확장 함수를 활용 (BufferedReader 자동 close)
try를 표현식으로 사용 → 값 반환
runCatching을 사용해 더 코틀린스럽게 리팩토링 가능
 */

class FileUtil {
    companion object {
        fun readFirstLine(path: String): String {
            return runCatching {
                BufferedReader(FileReader(path)).use { br ->
                    br.readLine()
                }
            }.getOrElse { e ->
                "Error: ${e.message}"
            }
        }

        fun readFirstLine2(path: String): String {
            return try {
                BufferedReader(FileReader(path)).use { it.readLine() }
            } catch (e: IOException) {
                "Error: ${e.message}"
            }
        }

        fun readFirstLine3(path: String): String {
            return runCatching {
                BufferedReader(FileReader(path)).use { it.readLine() }
            }.getOrElse { e-> "Error: ${e.message}" }
        }

        fun readFirstLine4(path: String) {
            return runCatching {
                BufferedReader(FileReader(path)).use { it.readLine() }
            }.fold(
                onSuccess = { it },
                onFailure = { e -> "Error: ${e.message}" }
            )
        }
    }
}

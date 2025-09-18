package practice

import java.io.BufferedReader
import java.io.FileReader
/*
🚀 서른두 번째 문제 (예외 처리 + use 함수 활용)

다음 Java 코드를 Kotlin으로 변환하세요.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {
    public static String readFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return "Error: " + e.getMessage();
        }
    }
}


👉 변환 시 고려사항:
Kotlin의 use 확장 함수 활용 (BufferedReader 자동 close)
try 를 expression으로 사용
runCatching 버전도 고려 가능
 */


class FileUtil2 {
    companion object {
        fun readFile(path: String): String =
            runCatching {
                BufferedReader(FileReader(path)).use { it.readLine() }
            }.getOrElse {
                e -> "Error: ${e.message}"
            }
    }
}
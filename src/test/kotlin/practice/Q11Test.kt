package practice

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q11Test {

    @Test
    fun isPalindromeTrue() {
        assertEquals(true, "ABCBA".isPalindrome())
    }

    @Test
    fun isPalindromeFalse() {
        assertEquals(false, "ABCDE".isPalindrome())
    }

}
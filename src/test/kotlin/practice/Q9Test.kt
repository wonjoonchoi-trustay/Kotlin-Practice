package practice

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Q9Test {
    private val successResult: Result = Result.Success("success")
    private val errorResult: Result = Result.Error("error")

    @Test
    fun checkSuccessResult() {
        assertEquals("Success with data: success", handleResult(successResult))
    }

    @Test
    fun checkErrorResult() {
        assertEquals("Error: error", handleResult(errorResult))
    }

}
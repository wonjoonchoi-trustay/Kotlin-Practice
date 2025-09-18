package practice

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test
import kotlin.test.assertFailsWith

class Q25Test {

    @Test
    fun testProductInitialization() {
        val product = Product("Sample", 100)
        assertEquals("Sample", product.name)
        assertEquals(100, product.price)

        assertFailsWith<IllegalArgumentException> { Product("Sample", -100) }
    }

    @Test
    fun testGetDisplayName() {
        val product = Product("Sample", 100)
        assertEquals("SAMPLE - 100", product.getDisplayName())
    }
}
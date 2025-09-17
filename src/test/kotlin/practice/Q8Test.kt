package practice

import kotlin.test.Test
import kotlin.test.assertEquals

class Q8Test {
    private val doggy = Dog("Doggy")
    private val kitten = Cat("Kitten")

    @Test
    fun dogMakeSound() {
        assertEquals(doggy.name + " says: Woof!", doggy.makeSoundStr())
        assertEquals(kitten.name + " says: Meow!", kitten.makeSoundStr())

    }

}
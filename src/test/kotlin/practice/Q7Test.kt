package practice

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Q7Test {

    @Test
    fun PersonCreateSuccess() {
        val person = Person("Joon", age = 33)

        assertEquals("Joon", person.name)
        assertEquals(33, person.age)
        assertEquals(true, person.isAdult)
        assertEquals("JOON", person.upperCaseName)
    }

    @Test
    fun PersonCreateFailure() {
        assertFailsWith<IllegalArgumentException> {
            Person(name = "ErrorCase", age =- 1)
        }
    }

    @Test
    fun EntityDtoConvert() {
        val dto = PersonDto("Joon", age = 33)
        val entity = dto.toEntity()
        assertEquals("Joon", entity.name)
        assertEquals(33, entity.age)
        assertEquals(true, entity.isAdult)
        assertEquals("JOON", entity.upperCaseName)

        val convertedDto = entity.toDto()
        assertEquals("Joon", convertedDto.name)
        assertEquals(33, convertedDto.age)
    }

    @Test
    fun PersonEntityCreateFailure() {
        assertFailsWith<IllegalArgumentException> {
            Person(name = "ErrorCase", age =- 1)
        }
    }

}
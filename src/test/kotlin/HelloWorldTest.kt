import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class HelloWorldTest {
    @Test
    fun `this finally fucking works`() {
        assertEquals(HelloWorld("Alex").speak(), "Hello Alex!")
    }
}
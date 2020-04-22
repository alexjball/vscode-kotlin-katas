
import org.junit.jupiter.api.Test

/**
 * Poker Hand Kata: http://codingdojo.org/kata/PokerHands/
 *
 * Driver (D): The person that codes
 * Navigator (N): The person that tells the driver what to do
 * 5 minute rounds
 * Roles rotate down and around
 *
 * D
 * N
 */

class PokerHandsTest {
    @Test
    fun `Can create a hand`() {
        Hand("2H 3D 5S 9C KD")
    }
}

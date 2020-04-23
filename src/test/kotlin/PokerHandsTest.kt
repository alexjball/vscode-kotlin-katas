
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * Poker Hand Kata: http://codingdojo.org/kata/PokerHands/
 *
 * Driver (D): The person that codes
 * Navigator (N): The person that tells the driver what to do
 * 10 minute rounds
 * Roles rotate down and around
 */

class PokerHandsTest {
    @Test
    fun `Can create a hand`() {
        Hand("2H 3D 5S 9C KD")
    }

    @Test
    fun `showWinner returns tie for same hand`() {
        val blackHand = Hand("2H 3D 5S 9C KD")
        val whiteHand = Hand("2D 3H 5C 9S KH")
        assertEquals(showWinner(blackHand, whiteHand), "Tie")
    }

    @Test
    fun `get rank of royal card`() {
        assertEquals(13, rank("KH"))
        assertEquals(12, rank("QH"))
        assertEquals(11, rank("JH"))
    }
    
    @Test
    fun `detect illegal character`() { 
        val black = Hand(" ")
        val white = Hand("2D 3H 5C 9S KH")
        assertEquals("invalid character", showWinner(black, white))
    }
}

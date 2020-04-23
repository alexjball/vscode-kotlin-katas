class Hand(val hand: String) {

}

fun showWinner(blackHand: Hand, whiteHand: Hand): String {
  fun validate() {
      for ()
  }

  return "Tie"
}

fun rank(card: String): Int {
    val firstLetter = card[0]
    return when (firstLetter) {
        'J'-> 11
        'Q'-> 12
        'K'-> 13
        else -> 0
    }    
}
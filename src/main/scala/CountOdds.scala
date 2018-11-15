object CountOdds {

  def countAmountOfOddNumbers(number: Int): Int = {

    number match {

      case even if even % 2 == 0 => countOddsFromEvenNumber(even)
      case odd => countOddsFromOddNumber(odd)
    }
  }

  def countOddsFromEvenNumber(evenNumber: Int): Int = {
    evenNumber / 2
  }

  def countOddsFromOddNumber(oddNumber: Int): Int = {
    (oddNumber - 1) / 2
  }
}

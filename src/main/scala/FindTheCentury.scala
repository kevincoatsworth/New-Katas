object FindTheCentury extends App {

  def returnTheCentury(year: Int): Int = {

    val x = year.toString.toList

    x.last match {
      case a if a == 0 => year / 10
      case _ => year/10 + 1
    }
  }
}


object NumberToLCD extends App {

  def converterAndOutput(numberToConvert: Int): List[LCD] = {

    val output: List[LCD] = intToString(numberToConvert).map {

      case "1" => One
      case "2" => Two
      case "3" => Three
      case "4" => Four
      case "5" => Five
      case "6" => Six
      case "7" => Seven
      case "8" => Eight
      case "9" => Nine
      case "0" => Zero

    }

    println(output.map(lcd => lcd.lineOne).mkString(""))
    println(output.map(lcd => lcd.lineTwo).mkString(""))
    println(output.map(lcd => lcd.lineThree).mkString(""))

    output
  }

  private def intToString(numberToConvert: Int): List[String] = {
    numberToConvert.toString.split("").toList
  }
}

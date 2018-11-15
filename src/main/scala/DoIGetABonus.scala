object DoIGetABonus {

  def bonusCalculator(salary: Int, bonus: Boolean): String = {

    bonus match {
      case true => s"£${{salary * 1.2}.toInt}"
      case false => s"£$salary"
    }
  }
}
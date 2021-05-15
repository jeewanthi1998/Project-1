package Assignment1

object Q1 {

  def temp(celcius: Int): Double = {
    var faranheit: Double = 0
    faranheit = celcius * 1.8 + 32
    return faranheit
  }

  def main(args: Array[String]) = {
    println("Faranheit Tempreture : " + temp(35) + " F")
  }
}

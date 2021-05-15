package Assignment1



object Q2 {
  def volume(radius : Double):Double={
    val pi = 3.14
    var volume:Double = 0
    volume = 4/3*pi*radius
    return volume
  }

  def main(args: Array[String]) = {
    println("Radius =" + volume(5))
  }



}

package Assignment1


object Q3 {
  def cost(price:Double , copies:Int):Double={
    val discount = price * (40).toDouble./(100:Double)
    var Total = price - discount

    if(copies < 50){
      Total = Total + 3
    }
    else{
      Total = (Total + 3) + (copies - 50)* 0.75
    }
    return Total
  }

  def main(args: Array[String]) = {
    println("Total Cost = " + cost(24.95, 60))
  }


}

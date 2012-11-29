package tests.scala

import janala.Main
import catg.CATG

object StringMatchTest {

  def main(args: Array[String]) {
    val n = Main.readString("A")
    println(n)
    Main.MakeSymbolic(n)

    n match {
      case "A" =>
        println("Found a A")
      case "B" =>
        println("Found a B")
      case "C" =>
        println("Found a C")
      case "D" =>
        println("Found a D")
      case y:String =>
        if(y.length>10) println("Y is greater than 10") else println("Y is less than 10")
      case _ => println("Fell out the bottom")
    }
  }
}

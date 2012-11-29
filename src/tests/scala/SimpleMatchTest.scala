package tests.scala

import janala.Main
import catg.CATG

object SimpleMatchTest {

  def main(args: Array[String]) {
    val n = Main.readInt(0)
    println(n)
    Main.MakeSymbolic(n)

    n match {
      case 0 =>
        println("Found a 0")
      case 1 =>
        println("Found a 1")
      case 2 =>
        println("Found a 2")
      case 3 =>
        println("Found a 3")
      case y:Int =>
        if(y>10) println("Y is greater than 10") else println("Y is less than 10")
      case _ => println("Fell out the bottom")
    }
  }
}

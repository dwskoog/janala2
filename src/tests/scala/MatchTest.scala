package tests.scala

import janala.Main

object CaseClass {

  def main(args: Array[String]) {
    val n = Main.readInt(0)
    Main.MakeSymbolic(n)
    val o = Main.readInt(0)
    Main.MakeSymbolic(o)
    val x:Any = (n,o)

    x match {
      case (x,0) => println("Found a 0")
      case (x:Int,y:Int) => if(y>10) println("Y is greater than 10") else println("Y is less than 10")
      case _ => println("Fell out the bottom")
    }
  }
}

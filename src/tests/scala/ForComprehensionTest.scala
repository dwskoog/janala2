package tests.scala

import janala.Main

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 11/25/12
 * Time: 5:18 PM
 * To change this template use File | Settings | File Templates.
 */
object ForComprehensionTest {
  def main(args: Array[String]) {
    val high = Main.readInt(10)
    val lo = Main.readInt(0)
    Main.MakeSymbolic(high)
    Main.MakeSymbolic(lo)
    for (i <- lo to high) {
      Main.MakeSymbolic(i)
      if (i < 0) println(-i) else println(i)
    }
  }
}

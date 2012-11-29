package tests.scala

import janala.Main


/**
 * Created with IntelliJ IDEA.
 * User: davidskoog
 * Date: 11/26/12
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
object RangeSimpleTest {
  def createRange() = {
    val i = Main.readInt(0)
    Main.MakeSymbolic(i)
    val j = Main.readInt(0)
    Main.MakeSymbolic(j)

    if(i < 0 || j < 0) {
      0 to 0
    } else if(i<j) {
      i to j
    } else {
      j to i
    }
  }

  def main(args: Array[String]) {
    val r = createRange()
    println(r.head)
  }
}

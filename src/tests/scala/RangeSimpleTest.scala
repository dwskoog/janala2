package tests.scala

import janala.Main

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
    val r:Range = createRange()
    println("Created Range "+r.start+" to "+r.end)
  }
}

package tests.scala

import janala.Main

/**
 * Created with IntelliJ IDEA.
 * User: davidskoog
 * Date: 11/28/12
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 */
object ForIntArray {

  def fill(length: Int): Array[Int] = {
    val ints = new Array[Int](length)
    def fill2(index: Int) {
      ints(index) = Main.readInt(index)
      Main.MakeSymbolic(ints(0))
      if (index < length - 1) fill2(index+1)
    }
    fill2(0)
    ints
  }

  def main(args: Array[String]) {
    val ints = fill(3)
    for (i <- ints) {
      if (i*i<0) {
        println(i)
      }
    }
  }
}

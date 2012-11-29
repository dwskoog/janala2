package tests.scala

import janala.Main

/**
 * Created with IntelliJ IDEA.
 * User: davidskoog
 * Date: 11/28/12
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
object ForString {
  def main(arg: Array[String]) {
    val strs = Array(Main.readString("str1"), Main.readString("str2"), Main.readString("str3"))
    Main.MakeSymbolic(strs(0))
    Main.MakeSymbolic(strs(1))
    Main.MakeSymbolic(strs(2))
    for (str <- strs) {
      Main.MakeSymbolic(str.charAt(0))
      if (str.charAt(0).isUpper) {
        println("foo")
      } else {
        println(str)
      }
    }
  }
}

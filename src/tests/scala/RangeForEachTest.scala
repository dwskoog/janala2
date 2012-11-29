package tests.scala

/**
 * Created with IntelliJ IDEA.
 * User: davidskoog
 * Date: 11/26/12
 * Time: 3:48 PM
 * To change this template use File | Settings | File Templates.
 */
object RangeForEachTest {
  def main(args: Array[String]) {
    val r = 1 to 10
    val fun = {x: Int => println(x)}
    r.foreach(fun)
  }
}

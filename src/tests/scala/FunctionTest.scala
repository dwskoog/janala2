package tests.scala

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 11/26/12
 * Time: 9:34 PM
 * To change this template use File | Settings | File Templates.
 */
object FunctionTest {
  def main(args: Array[String]) {
    new FunctionTest()
  }
}

class FunctionTest {
  val f = {x:Int => println(x)}
  f.apply(1)
}

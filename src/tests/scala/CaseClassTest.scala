package tests.scala

import janala.Main

object CaseClassTest {

  abstract class Tree
  case class Branch(left: Tree, right: Tree) extends Tree
  case class Leaf(x: Int) extends Tree

  def sumLeaves(t: Tree): Int = t match {
    case Branch(l, r) => sumLeaves(l) + sumLeaves(r)
    case Leaf(x) => x
  }

  def main(args: Array[String]) {
    val leaf1 = Leaf(1)
    val leaf2 = Leaf(2)
    val leaf3 = Leaf(3)
    val leaf4 = Leaf(4)
    Main.MakeSymbolic(leaf1.x)
    Main.MakeSymbolic(leaf2.x)
    Main.MakeSymbolic(leaf4.x)
    val branch1 = Branch(leaf1,leaf2)

    val tree1 = Branch(branch1,leaf4)
    println("sum of leafs=" + sumLeaves(tree1))
  }
}
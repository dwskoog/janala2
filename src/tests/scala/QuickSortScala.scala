package tests.scala

import tests.java15.util.Arrays
import janala.Main

object QuickSortScala {

  def fill(data: Array[Int]): Unit = {
    def fill(i: Int): Unit = {
      data(i) = Main.readInt(0)
      System.out.print("data: ")
      System.out.println(data(i))
      Main.MakeSymbolic(data(i))
      if (i < data.length-1) fill(i+1)
    }
    fill(0)
  }

  def print(data: Array[Int]): Unit = {
    def print(i: Int): Unit = {
      System.out.print(data(i))
      System.out.print(" ")
      if (i < data.length -1) print(i+1)
    }
    print(0)
  }

  def check(data: Array[Int]): Unit = {
    def check(i: Int): Unit = {
      assert(data(i) <= data(i + 1))
      if (i < data.length - 2) check(i+1)
    }
  }

  def main(args: Array[String]) {
    val N: Int = 4
    System.out.print("In main...")
    System.out.println(N)
    var data = new Array[Int](N)
    fill(data)

    Arrays.sort(data)
    print(data)
    System.out.println()
    check(data)

    N
  }
}



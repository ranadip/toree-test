package com.google.ranadip

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    PrintMyName.printName
    println("concat arguments = " + foo(args))
  }

}

/**
 * Created by Colm on 12/04/2016.
 */

import org.scalatest.FunSuite
import ChapterTwo._
class ChapterTwoTest   extends FunSuite{
  test("Tests for fib")  {
    assert(fib(0) == 0)
    assert(fib(1) == 1)
    assert(fib(2) == 3)
  }
  test("is sorted for different arrays") {
    val array1 = Array(1,2,3)
    val array2= Array(3,2,1)
    def comparerInt(a:Int,b:Int):Boolean = {
      if (a > b) true
      else false
    }
    val array3 = Array("a","b","c")
    val array4 = Array("b","a","c")
    def comparerString(a:String,b:String):Boolean ={
      val result = a.compareTo(b)
      if (result > 0) true
      else false
    }
    assert(isSorted(array1,comparerInt) == true)
    assert(isSorted(array2,comparerInt) == false)
    assert(isSorted(array3,comparerString) == true)
    assert(isSorted(array4,comparerString) == false)
  }

}

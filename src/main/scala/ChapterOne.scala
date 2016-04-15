import scala.annotation.tailrec

/**
 * Created by Colm on 12/04/2016.
 */
object ChapterTwo {


  def fib(n:Int):Int = {
  @tailrec
  def go(n: Int, a: Int): Int = {
    if (n == 0) a
    else go(n - 1, a + n)
  }
  go(n,0)
}

  def isSorted[A](as:Array[A], gt:(A,A) => Boolean):Boolean ={
    @tailrec
    def iter(i: Int): Boolean = {
      if (i >= as.length - 1) true
      else if(gt(as(i), as(i + 1))) false
      else iter(i + 1)
    }
    iter(0)
  }
}

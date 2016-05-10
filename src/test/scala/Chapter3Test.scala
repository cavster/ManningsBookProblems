import org.scalatest.FunSuite

/**
 * Created by Colm on 17/04/2016.
 */
import List._
class Chapter3Test extends FunSuite{
  val testList = List(1,2,3)
  val testEmptyList = List()

  test("then list should have its head removed in"){
    val output = tail(testList)
    assert(output == List(2,3))
  }
  test("An Empty list will thrown an exception ")  {
    val output = intercept[Exception](tail(testEmptyList))
    assert(output.getMessage == "tail of empty list")
  }
  test("The list should drop 2 elements in ")  {
    val output = drop(testList,2)
    assert(output == List(3))
  }
  test("The list should dropwhile `1 elements in ")  {
    def test(a:Int) = a == 1
    val output = dropWhile(testList,test)
    assert(output == List(2,3))
  }


}

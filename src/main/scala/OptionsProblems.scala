

sealed trait Maybe[+A] {
  def map[B](f: A => B): Maybe[B] = this match {
    case Absent => Absent
    case Just(a) => Just(f(a))
  }

  def flatMap[B](f: A => Maybe[B]) = this match {
    case Absent => Absent
    case Just(a) => f(a)
  }

  def getOrElse[B >: A](default: => B): B = this match {
    case Just(a) => a
    case _ => default
  }

  def orElse[B >: A](ob: => Maybe[B]): Maybe[B] = this match {
    case Absent => ob
    case _ => this
  }

  def filter(f: A => Boolean) = this match {
    case Just(a) if f(a) => this
    case _ => Absent
  }

  def isDefined: Boolean = this match {
    case Absent => false
    case _ => true
  }

}

//so some value A ans
case class Just[A](get: A) extends Maybe[A]

case object Absent extends Maybe[Nothing] {
  def get = throw new UnsupportedOperationException("get not defined on Absent")
}
object Chapter4 extends App {

  /** Calling this Maybe, Just and Absent to avoid name conflicts ... */

  /** Exercise 1
    *
    * Implement map, flatMap, getOrElse, orElse and filter
    */
  val test = Some("123")
  test.map(_.toInt)
  println(test)
}
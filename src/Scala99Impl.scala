
object Scala99Impl {

  def last[T] ( s:Seq[T] ): T = s match {
    case end :: Nil => end
    case head :: rest => last(rest)
    case _ => throw new Error
  }

  def penultimate[T]( s: Seq[T]):T = s match {
    case a :: List( _ ) => a
    case a :: b => penultimate(b)
    case _ => throw new NoSuchElementException
  }


  def nth[T](index:Int, seq:Seq[T]):T = (index, seq) match {
    case (0, a :: _) => a
    case (n, _ :: b) => nth( n-1, b )
    case _ => throw new NoSuchElementException
  }

  def length[T](seq:Seq[T]):Int = seq match {
    case a :: Nil => 1
    case _ :: b   => length(b) + 1
  }

  def reverse[T](seq:List[T]):List[T] = seq match {
    case a :: Nil => List(a)
    case a :: b => reverse(b) ::: List(a)
    case Nil => Nil
  }

  def isPalindrome[T](seq:Seq[T]):Boolean = seq.reverse == seq

  def flatten(seq:Seq[Any]):Seq[Any] = seq.flatMap {
    case a:Seq[_] => flatten(a)
    case b => List(b)
  }



}


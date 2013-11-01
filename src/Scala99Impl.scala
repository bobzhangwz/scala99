
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


}

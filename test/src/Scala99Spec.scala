import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import Scala99Impl._

class Scala99Spec extends FlatSpec with ShouldMatchers {
  it should "Find the last element of a list" in {
    last(List(1, 1, 2, 3, 5, 8)) should be (8)
    intercept[Error]( last(Nil) )
  }

  it should " Find the last but one element of a list" in {
    penultimate(List(1, 1, 2, 3, 5, 8)) should be (5)
  }
}

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import Scala99Impl._

class Scala99Spec extends FlatSpec with ShouldMatchers {

  it should "Find the last element of a list" in {
    last(List(1, 1, 2, 3, 5, 8)) should be (8)
    intercept[Error]( last(Nil) )
  }

  it should "Find the last but one element of a list" in {
    penultimate(List(1, 1, 2, 3, 5, 8)) should be (5)
    intercept[NoSuchElementException]( penultimate(Nil) )
    intercept[NoSuchElementException]( penultimate( List(1) ) )
  }

  it should "Find the Kth element of a list" in {
    nth(2, List(1, 1, 2, 3, 5, 8)) should be (2)
  }

  it should "Find the number of elements of a list" in {
    Scala99Impl.length(List(1, 1, 2, 3, 5, 8)) should be (6)
  }

  it should "Reverse a list" in {
    reverse(List(1, 1, 2, 3, 5, 8)) should be ( List(8, 5, 3, 2, 1, 1) )
  }

  it should "Find out whether a list is a palindrome" in {
    isPalindrome(List(1, 2, 3, 2, 1)) should be ( true )
  }

  it should "Flatten a nested list structure" in {
    flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be ( List(1, 1, 2, 3, 5, 8) )
  }



}

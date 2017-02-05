package week2
import week3._
object Rationals {
  val x = new Rational(1, 3)                      //> x  : week3.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : week3.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : week3.Rational = 3/2
 
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def addRational(r: Rational, s: Rational): Rational =
    new Rational(
      r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom)                          //> addRational: (r: week3.Rational, s: week3.Rational)week3.Rational
  def makeString(r: Rational) =
    r.numer + "/" + r.denom                       //> makeString: (r: week3.Rational)String

  makeString(addRational(new Rational(1, 2), new Rational(2, 3)))
                                                  //> res0: String = 7/6
  x + y                                           //> res1: week3.Rational = 22/21
  x.neg                                           //> res2: week3.Rational = -1/3
  x - y                                           //> res3: week3.Rational = -8/21
  x - y - z                                       //> res4: week3.Rational = -79/42
  x < y                                           //> res5: Boolean = true
  x max y                                         //> res6: week3.Rational = 5/7
}



	
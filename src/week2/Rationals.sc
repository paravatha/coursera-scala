package week2

object Rationals {
  val x = new Rational(1, 3)                      //> x  : week2.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : week2.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : week2.Rational = 3/2
 
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def addRational(r: Rational, s: Rational): Rational =
    new Rational(
      r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom)                          //> addRational: (r: week2.Rational, s: week2.Rational)week2.Rational
  def makeString(r: Rational) =
    r.numer + "/" + r.denom                       //> makeString: (r: week2.Rational)String

  makeString(addRational(new Rational(1, 2), new Rational(2, 3)))
                                                  //> res0: String = 7/6
  x + y                                           //> res1: week2.Rational = 22/21
  x.neg                                           //> res2: week2.Rational = -1/3
  x - y                                           //> res3: week2.Rational = -8/21
  x - y - z                                       //> res4: week2.Rational = -79/42
  x < y                                           //> res5: Boolean = true
  x max y                                         //> res6: week2.Rational = 5/7
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def + (that: Rational) =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
    
  def < (that: Rational) =
  	this.numer * that.denom < that.numer * this.denom
  	
  def max(that: Rational) = if (this < that) that else this
  	

  def neg: Rational = new Rational(-numer, denom)

  def - (that: Rational) = this + that.neg

  override def toString = numer + "/" + denom
}


	
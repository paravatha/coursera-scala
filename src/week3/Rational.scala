package week3

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
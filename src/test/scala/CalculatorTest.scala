import org.scalatest.flatspec.AnyFlatSpec
class CalculatorTest extends AnyFlatSpec {
  val calculator = new Calculator
  //Addition Test Cases:
  //case-1
  "If we add two number it" should " give positive value greater then both of them " in {
    val res = calculator.ADD(10, 5)
    assert(res == 15)
  }
  //case-2
  "If we add two -ve numbers it" should " give negative value which is smaller then those no " in {
    val res = calculator.ADD(-10, -5)
    assert(res == -15)
  }
  //case-3
  "If we add any number with zero it" should " give the number itself" in {
    val res = calculator.ADD(10, 0)
    assert(res == 10)
  }
  //Subtraction Test Cases:
  //case-1
  "If we Subtract two number it" should " give value atleast smaller then one of them " in {
    val res = calculator.SUB(10, 5)
    assert(res == 5)
  }
  //case-2
  "If we add two -ve numbers it" should " give value which is greater then the which is used no " in {
    val res = calculator.SUB(-10, -5)
    assert(res == -5)
  }
  //case-3
  "If we sub any number with zero it" should " give the number itself" in {
    val res = calculator.SUB(10, 0)
    assert(res == 10)
  }
  //Multiplication Test Cases:
  //case-1
  "If we multiply two +ve number it" should " give value a no bigger then both of them " in {
    val res = calculator.MULTIPLY(10, 5)
    assert(res == 50)
  }
  //case-2
  "If we multiply two -ve numbers it" should " give a +ve no" in {
    val res = calculator.MULTIPLY(-10, -5)
    assert(res == 50)
  }
  //case-3
  "If we MULTIPLY any number with zero it" should " 0" in {
    val res = calculator.MULTIPLY(10, 0)
    assert(res == 0)
  }
  //case-4
  "If we MULTIPLY any +ve number with -ve no it" should " give -ve no" in {
    val res = calculator.MULTIPLY(10, -5)
    assert(res == -50)
  }
  //DIVISION Test Cases:
  //case-1
  "If we divide two +ve number it" should " give value a +ve no " in {
    val res = calculator.DIVIDE(10, 5)
    assert(res == 2)
  }
  //case-2
  "If we divide two -ve numbers it" should " give a +ve no" in {
    val res = calculator.DIVIDE(-10, -5)
    assert(res == 2)
  }
  //case-3
  "If we divide 0 by any number it" should " give 0" in {
    val res = calculator.DIVIDE(0, 10)
    assert(res == 0)
  }
  //Modulud Test Cases:
  //case-1
  "If we divide two positive number it" should " give value a +ve no " in {
    val res = calculator.MODULUS(10, 5)
    assert(res == 0)
  }
  //case-2
  "If we divide two -ve no it" should " give the value in -ve" in {
    val res = calculator.MODULUS(-20, -6)
    assert(res == -2)
  }
  //Power Test Cases:
  //case-1
  "If we find power of a number it" should " give positive value  " in {
    val res = calculator.POWER(10, 2)
    assert(res == 100)
  }
  //case-2
  "If power of a -ve no it" should " give negative value if power is a even no " in {
    val res = calculator.POWER(-10, 2)
    assert(res == 100)
  }
  //case-3
  "If power of any no is 0" should " give 1" in {
    val res = calculator.POWER(10, 0)
    assert(res == 1)
  }
  //case-4
  "If power of any no is 1" should " give no itself" in {
    val res = calculator.POWER(10, 1)
    assert(res == 10)
  }
  //Absolute
  //case-1
  "negative number" should "give positive number" in {
    val res = calculator.ABSOLUTE(-1)
    assert(res == 1)
  }
  //case-2
  "positive number" should "give positive number" in {
    val res = calculator.ABSOLUTE(number = 2)
    assert(res == 2)
  }
}

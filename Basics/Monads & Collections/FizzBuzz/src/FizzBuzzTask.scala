object FizzBuzzTask {
  def fizzBuzzIt(s: Seq[Int]): Seq[String] =
    s.map { n =>
      (n % 3, n % 5) match {
        case (0, 0) => "FizzBuzz"
        case (_, 0) => "Buzz"
        case (0, _) => "Fizz"
        case (_, _) => n.toString
      }
    }
}

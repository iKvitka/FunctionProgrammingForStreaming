object FibonacciWithMemoTask {
  def memoFibonacci(): Int => Long = {
    val cache = scala.collection.mutable.Map[Int, Long](0 -> 0, 1 -> 1)
    def fib(n: Int): Long = cache.getOrElseUpdate(n, fib(n - 1) + fib(n - 2))
    fib
  }
}

object TailFibonacciTask {
  def fibonacciImpl2(): Int => Int = {
    def fun: (Int) => Int = (depth) => {
      if (depth < 2) depth
      else tailFib(0, 1, depth)
    }
    @scala.annotation.tailrec def tailFib(previous: Int, current:Int, depth:Int):Int = {
      if (depth < 2) current
      else tailFib(current, previous + current, depth - 1)
    }

    fun
  }
}

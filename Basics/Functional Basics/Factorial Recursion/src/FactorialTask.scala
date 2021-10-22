import scala.annotation.tailrec

object FactorialTask {

  def factorialImpl(): Int => Long = {
    def fact: Int => Long = depth => {
      @tailrec
      def factHelper(result: Long, high: Int): Long =
        if (depth < high) result
        else factHelper(result * high, high + 1)

      factHelper(1, 1)
    }
    fact
  }
}

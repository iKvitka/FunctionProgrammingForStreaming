object PrimeCheckerTask {

  def isPrime(n: Long): Boolean = (2 to Math.sqrt(n).toInt).forall(n % _ != 0)
}

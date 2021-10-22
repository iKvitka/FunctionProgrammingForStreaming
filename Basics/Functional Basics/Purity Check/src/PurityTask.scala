object PurityTask {

  case class Integer(var value: Int)

  def isPure(incrementFn: Integer => Integer): Boolean = {
    val input = Integer(1)
    val res   = input.copy()
    incrementFn(input)
    res.value == input.value && incrementFn(incrementFn(input)) == Integer(3)
  }
}

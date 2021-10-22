object BiYCombinator {
  // magic
  def fix[A, B, C](bifnFactory: ((A, B) => C) => (A, B) => C):(A, B) => C = new Function2[A,B,C]{
   def apply(in:A, b:B): C =  bifnFactory(this)(in,b)
  }
}

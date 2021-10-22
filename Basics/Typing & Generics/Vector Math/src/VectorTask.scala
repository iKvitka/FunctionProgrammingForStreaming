object VectorTask {

  trait Vector[A <: Vector[A]] {

    /**
		 * Get value of the vector at specific position
		 *
		 * @param position of vector value. Must be less than `size`
		 * @return value at the given position */
    def apply(position: Int): Float

    /**
		 * Create a new Vector instance with the given value and previous values
		 *
		 * @param position of vector value. Must be less than `size`
		 * @param value    the value to set
		 * @return new instance of this vector */
    def modify(position: Int, value: Float): Vector[A]

    /**
		 * Provides the size of this vector
		 *
		 * @return actual size of the vector */
    def size(): Int
  }

  def sum[A <: Vector[A]](vector1: Vector[A], vector2: Vector[A]): Vector[A] =
    recursiveModify((a, b) => a + b, vector1, vector2, vector1, vector1.size() - 1)

  def sub[A <: Vector[A]](vector1: Vector[A], vector2: Vector[A]): Vector[A] =
    recursiveModify((a, b) => a - b, vector1, vector2, vector1, vector1.size() - 1)

  // no more test driven designs
  @scala.annotation.tailrec
  def recursiveModify[A <: Vector[A]](function: (Float, Float) => Float,
                                      v1: Vector[A],
                                      v2: Vector[A],
                                      result: Vector[A],
                                      depth: Int): Vector[A] =
    if (depth < 0) result
    else recursiveModify(function, v1, v2, result.modify(depth, function(v1(depth), v2(depth))), depth - 1)

}

import scala.util.Try

object MapTask {
  def mapping(input: Seq[String]): Seq[Int] = {
    input.flatMap(str => Try(str.toInt).toOption)
  }
}
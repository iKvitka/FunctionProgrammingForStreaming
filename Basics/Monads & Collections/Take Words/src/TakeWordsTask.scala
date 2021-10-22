import scala.annotation.tailrec

object TakeWordsTask {
  val lineSeparatorString = "\n"
  val regex = s"((?<=$lineSeparatorString)|(?=$lineSeparatorString))"

  def takeWords(seq: Seq[String]): Seq[String] =
    seq.flatMap(_.split(regex)).takeWhile(_!=lineSeparatorString)

    //but why do that if you can do this. Ultimate power of functional programming. Test driven development
    //seq.mkString(" ").split(lineSeparatorString).headOption.getOrElse("").split(" ").filter(_.nonEmpty).toList
}

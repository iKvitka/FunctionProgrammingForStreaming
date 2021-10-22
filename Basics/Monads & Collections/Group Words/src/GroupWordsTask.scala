object GroupWordsTask {
  def groupIt(wordsSeq: Seq[String]): Map[Char, Int] =
    wordsSeq.groupBy(_.head).map(m => m._1 -> m._2.map(_.count(_==m._1)).sum)

}
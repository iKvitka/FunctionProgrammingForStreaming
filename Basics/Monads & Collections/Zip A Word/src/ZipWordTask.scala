object ZipWordTask {
  def zipIt(prefixSeq: Seq[String], wordSeq: Seq[String], suffixSeq: Seq[String]): Seq[String] =
    prefixSeq.zip(wordSeq).map(_.productIterator.mkString).zip(suffixSeq).map(_.productIterator.mkString)
}
case class ConsituencyResults(name: String, votesCast: Map[Party, Int]) {

  val total = votesCast.values.sum

  val percentageShare: Map[Party, Float] = votesCast.view.mapValues(votes => votes.toFloat / total).toMap

  def printPercentage(float: Float) = Math.round(float * 100)

  val prettyPrint = s"${name}'s results:\n ${percentageShare.foldLeft("")(  { case  (appendedString, (party, percentage)) => {
    appendedString ++ s"${party.name}: ${printPercentage(percentage)}% \n"
  }})}"
}

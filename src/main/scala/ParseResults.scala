case class PartyToResults(result: Int, party: Party )

object ParseResults {

  //todo - this should return an either
  def parseNumber(s: String): Int = {
    s.trim.toInt
  }


  def parsePartyCode(s: String): Party = {
    s.trim match {
      case Conservative.code => Conservative
      case Labour.code => Labour
      case UKIP.code => UKIP
      case LiberalDemocrats.code => LiberalDemocrats
      case GreenParty.code => GreenParty
      case Independent.code => Independent
//      case _ => Left(s"didnt understand ${s.trim}")
    }
  }

  def parseLine(line: String): Either[String, ConsituencyResults] = {

    val items = line.split(",").toList
    //check that the items have more than one element
    //check that there are an an odd number of elements

    val name = items.head

    val results = items.tail

    val parsedResults = results.sliding(2,2).map(ls => ls match {
      case el1 :: el2 :: Nil => Right(PartyToResults(parseNumber(el1), parsePartyCode(el2)))
      case _ => Left("error")
    }).toList


    val passedLines = parsedResults.collect { case Right(value) => value}
    val failedLines = parsedResults.collect { case Left(value) => value }

    if(failedLines.nonEmpty) {
      Left("error")
    }

    else {
      Right(ConsituencyResults(name, passedLines.map(p => (p.party -> p.result)).toMap))

    }
  }
}

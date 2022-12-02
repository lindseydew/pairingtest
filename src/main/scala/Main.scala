object Main extends App {


  val consituencyResults = ConsituencyResults("Cardiff West", Map( Conservative -> 11014,
                            Labour -> 17803, UKIP -> 4923, LiberalDemocrats -> 2069)
                            )

  println(consituencyResults.prettyPrint)

}

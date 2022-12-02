sealed trait Party {
  val code: String
  val name: String
}


case object Conservative extends Party {
  val code = "C"
  val name = "Conservative Party"
}

case object Labour extends Party {
  val code = "L"
  val name = "Labour Party"
}

case object UKIP extends Party {
  val code  = "UKIP"
  val name = "UKIP"
}

case object LiberalDemocrats extends Party {
  val code = "LD"
  val name = "Liberal Democrats"
}

case object GreenParty extends Party {
  val code = "G"
  val name = "Green Party"
}

case object Independent extends Party {
  val code = "Ind"
  val name = "Independent"
}

case object SNP extends Party {
  val code = "SNP"
  val name = "SNP"
}



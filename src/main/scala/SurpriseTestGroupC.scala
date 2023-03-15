// square a list of integer and display tha count of even and odd values in the list

object SurpriseTestGroupC extends App {

  val listOfIntegers: List[Int] = List[ 2,3,4,5,6,7 ]

  def squaredList ( listOfIntegers: List[Int] ): Any = {
    val squared = listOfIntegers.map(_^2)
  }

  def counter ( integers: List[Int] ): Int = {
//    if ( % 2 == 0 )
//    if ( % 2 != 0 )
  }
}

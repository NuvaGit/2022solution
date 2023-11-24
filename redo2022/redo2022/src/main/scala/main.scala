import scala.math.sqrt

@main
def main(): Unit = {
  val busStop1 = BusStop(2765, "Ranelagh", Point(6, 4))
  val busStop2 = BusStop(7532, "Donnybrook", Point(5, 5))
  val busStop3 = BusStop(2985, "Merrion", Point(4, 6))
  val busStop4 = BusStop(2987, "Clonskeagh", Point(3, 7))
  val busStop5 = BusStop(9583, "Milltown", Point(99, 99)) //not on route
  val busStops1 = BusStops()
  busStops1.addStop(busStop1)
  busStops1.addStop(busStop2)
  busStops1.addStop(busStop3)
  busStops1.addStop(busStop4)
  val route1 = Route(1, List(2765, 7532, 2985, 2987), busStops1)

  val busStop6 = BusStop(5826, "Rathmines", Point(2, 2))
  val busStop7 = BusStop(1285, "Dundrum", Point(3, 3))
  val busStop8 = BusStop(9933, "Goatstown", Point(4, 4))
  val busStop9 = BusStop(7532, "Donnybrook", Point(5, 5))
  val busStops2 = BusStops()
  busStops2.addStop(busStop6)
  busStops2.addStop(busStop7)
  busStops2.addStop(busStop8)
  busStops2.addStop(busStop9)
  val route2 = Route(2, List(5826, 7532, 9933, 1285), busStops2)

  val routes = Routes()
  routes.addRoute(route1)
  routes.addRoute(route2)

  val start1 = Point(6, 6)
  val destinationStop1 = "Donnybrook"
  val (stopName1, distance1) = routes.findNearestStop(start1, destinationStop1)
  println(stopName1+" Donnybrook")
  println(s"Distance: $distance1 == ${sqrt(2)}")


  val start2 = Point(6, 8)
  val destinationStop2 = "Clonskeagh"
  val (stopName2, distance2) = routes.findNearestStop(start2, destinationStop2)
  println(stopName2+ " Merrion")
  println(s"Distance: $distance2 == ${sqrt(2)*2}")

  val start3 = Point(1, 7)
  val destinationStop3 = "Donnybrook"
  val (stopName3, distance3) = routes.findNearestStop(start3, destinationStop3)
  println(stopName3 + " Clonskeagh")
  println(distance3+" "+ 2.0)

  val start4 = Point(2, 1)
  val destinationStop4 = "Goatstown"
  val (stopName4, distance4) = routes.findNearestStop(start4, destinationStop4)
  println(stopName4 + " Rathmines")
}
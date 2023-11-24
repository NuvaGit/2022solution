import scala.collection.mutable.ListBuffer

class Routes {
  var routes = new ListBuffer[Route]()
  def addRoute(route:Route): Unit = {
    routes += route
  }
  def mostCommonStopName(): String = {
    var names = new ListBuffer[String]()
    for(route <- routes) {
      for(name <- route.getbusnames()) {
        names += name
      }
    }
    names.groupBy(identity).maxBy(_._2.size)._1
  }
  def findNearestStop(location: Point, stopName: String):(String, Double) = {
    var temp = 0
    var index = 0

    for (route <- routes) {
      temp += 1
      for(name <- route.getbusnames()) {
        if(name == stopName) {
        temp = index
        }
      }
    }
    val routemain = routes(index)
    var busStops = routemain.getbustops().Stops
    var min = 100.0
    var temp5 = 0.0
    var name = ""
    for(stop <- busStops) {
      temp5 = location.distanceTo(stop.getPoint)
      if(temp5 < min) {
        min = temp5
        name = stop.getName
      }
    }
    (name, min)
  }

}

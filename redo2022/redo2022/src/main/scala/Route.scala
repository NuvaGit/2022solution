import scala.collection.mutable.ListBuffer
import scala.jdk.CollectionConverters.*

class Route(routeid: Int, busstopids: List[Int],busstops:BusStops) {

  def getRouteId(): Int = {
    routeid
  }

  def getbusstopsids(): List[Int] = {
    busstopids
  }

   def getbustops(): BusStops = {
    busstops
  }
  def getbusnames(): List[String] = {
    var names = new ListBuffer[String]()
    for(buses<- busstops.Stops ) {
      names += buses.getName
    }
    names.toList
  }

  def length(): Double = {
    var total = 0.0
    var j = 1
    for (buses <- busstops.Stops) {
      if(j < busstops.Stops.length) {
        total += buses.getPoint.distanceTo(busstops.Stops(j).getPoint)
        j += 1
      }
    }
    total
  }
}

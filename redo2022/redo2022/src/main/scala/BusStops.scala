import scala.collection.mutable.ListBuffer

class BusStops {
  var Stops = new ListBuffer[BusStop]()

  def getStops = Stops
  def addStop(stop: BusStop) = Stops += stop
  def sortByName() = Stops = Stops.sortBy(_.getName)

  override def toString(): String = {
    var temp = ""
    for(stop<- Stops) {
      temp += "["+stop.toString+"], "
    }
    if (temp.nonEmpty) {
      temp = temp.substring(0, temp.length - 2)
    }
    temp
  }
}

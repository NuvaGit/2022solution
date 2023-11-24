class BusStop(ID: Int, Name: String,point: Point) {

  def getID = ID
  def getName = Name
  def getPoint = point


  override def toString = s"$getID, $getName, $getPoint"
}

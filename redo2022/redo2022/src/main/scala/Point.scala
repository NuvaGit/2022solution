class Point(X:Int,Y:Int) {

  def getX = X
  def getY = Y
  def distanceTo(other:Point): Double = {
    val xDiff = X - other.getX
    val yDiff = Y - other.getY
    Math.sqrt(xDiff * xDiff + yDiff * yDiff)
  }

  override def toString = s"($getX, $getY)"
}

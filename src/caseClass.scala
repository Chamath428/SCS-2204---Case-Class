import scala.language.postfixOps

object caseClass extends App {
  val p1=Point(10,5);
  val p2=Point(5,3);
  println("Addition of Points : "+(p1+p2))
  println("After Moving : "+p1.move(2,3))
  println("Distance Between given points : "+p1.distance(p2))
  println("After Inverting : "+p1.invert())
}

case class Point(x:Int,y:Int){
  def +(that:Point)=Point(this.x+that.x,this.y+that.y);
  def move(dx:Int=0,dy:Int=0)=Point(this.x+dx,this.y+dy);
  def distance(that:Point):Double={
    val x= this.x-that.x;
    val y=this.y-that.y;
    val dist= x*x+y*y;
    scala.math.sqrt(dist);
  }
  def invert()=Point(this.y,this.x);
}

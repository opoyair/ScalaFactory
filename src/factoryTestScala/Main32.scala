package factoryTestScala

object Main32 {

  /* def calc(num:Int):Int = {
    
    if(num == 0) 
       0
    else  ((num / 10) %10) + calc((num/10))
  }*/
  
  def main(args:Array[String]) {
   // println("test")
   // println("the number is:" + calc(1) )
	 println( Shape("circle") )
   println(Shape("bar"))
  // println(Shape(""))
  
  }
  
 
  
}
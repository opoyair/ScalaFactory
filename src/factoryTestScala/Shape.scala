package factoryTestScala

import scala.collection.immutable.Nil

class Bar() extends Shape {
   def getName: String = {
    "this is Bar"
  }
}
class Circle() extends Shape() {
    def getName: String = {
   "this is Circle" }
}


abstract class  Shape () {
  
   def getName : String   
  
  /*def createFactory(obj:Shape) {
    obj  match {
      case Bar => println("the object is Bar instance") 
       
      case Circle => println("the object is Circle instance")
        
      case _ => println("error")  
      
    }
  }
  */
}

object Shape {
  
  def apply(name:String)  = {
    
   name match {
     case "bar" =>  new Bar().getName
     case "circle"  => new Circle().getName
     case _ => "error"
   }
    
  }
}


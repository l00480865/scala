object HelloWorld {
  def main(args: Array[String]): Unit = {
    var i :Int = 1
    if(i > 2) {
      println(i)
    } else {
      println(2)
    }
    for(j <- 0 to 5) {
      println(j)
    }
    println("The place we promised in our early days")
  }
}
package hello

object Hello {
  def main(args: Array[String]) {
    val strs = "Hello, World!";
    println(strs);
    for(num <- 1 to 10) {
      if (num == 1) {
        print(num);
      }
      print("," + num);
    }
    println();
    
    val str_array = Array("zero", "one", "two");
    
    str_array.foreach { str => println(str) }
    
    for (str <- str_array) {
      println(str);
    }
    
    val oneTwoThree = List(1, 2, 3);
    val fourFive = List(4, 5);
    val oneToFive = oneTwoThree ::: fourFive;
    
    println(oneToFive);
    
    val zeroToFive = 0 :: oneToFive;
    val oneToSix = oneToFive ::: 6 :: Nil;
    
    println(zeroToFive);
    println(oneToSix);
    
    zeroToFive.foreach { print }
    println()
    oneToSix.map { num => num * 10 }.foreach { println }
  }
}
class stringfunctions {


  def reverseString(newString: String): String = {
    var revString = ""
    val n = newString.length()
    for(i <- 0 until n){
      revString = revString.concat(newString.charAt(n-i-1).toString)
    }
    revString
  }

  def length(newString : String): Int = {
    val len = newString.length()
    var count = 0
    for(i <- 0 until len)
    {
      count = count + 1
    }
    count
  }
}

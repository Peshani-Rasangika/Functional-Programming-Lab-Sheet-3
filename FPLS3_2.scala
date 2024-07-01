def filterStrings(strings: List[String]): List[String]={
    strings.filter(_.length > 5);
}

def main(args: Array[String]) = {
    val texts = List("car", "bicycle", "bus", "aeroplane");
    val result = filterStrings(texts);
    println(result);
}
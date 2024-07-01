def mean(num1: Int, num2: Int): Float={
    val average = (num1 + num2) / 2.00;
     BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat;
}

def main(args: Array[String])={
    var num1 = 10;
    var num2 = 20;
    val average = mean(num1, num2);
    println(f"The average of $num1 and $num2 is : $average%.2f");
}
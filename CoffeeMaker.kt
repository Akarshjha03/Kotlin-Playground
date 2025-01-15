fun main (){
    println("Who is this coffee for?")
    var name = readln()
    println("How much sugar do you need?")
    var sugarcount = readln().toInt()
    makecoffee(sugarcount,name)
}

fun makecoffee(sugarcount: Int, name : String){
    if (sugarcount < 0){
        println("Choice is not available")
    }
    else if (sugarcount < 2){
        println("coffee with $sugarcount spoon of sugar for $name")
    }
    else if (sugarcount > 1){
        println("coffee with $sugarcount spoons of sugar for $name")
    }
}

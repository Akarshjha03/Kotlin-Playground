class Books (var title: String, var author: String , var yearpublished: Int){
    
}

fun main(){
    var mybook = Books(title="year1",author="akarsh",yearpublished=2025)
    println("${mybook.title} was printed on year 2025 by ${mybook.author}")
}

import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val c = nextInt()
    val d = listOf(a, b, c).max()
    
    if(a==b && b==c && a==c) print("${10000+(a*1000)}")
    else if(a!=b && b!=c && a!=c) print("${d*100}")
    else {
        if(a==b) print("${1000+a*100}")
        else if(a==c) print("${1000+a*100}")
        else print("${1000+b*100}")
    }  
}
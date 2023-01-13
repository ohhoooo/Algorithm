import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt()
    var b = StringBuilder() // 빈 공간
    var c = StringBuilder("") // 별
    
    for(j in 1..a) b.append(" ")
    
    for(i in 1..a) {
        b.deleteCharAt(0)
        c.append("*")
        println(b.toString() + c.toString())
    }
}
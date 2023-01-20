import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var tf = true
    var count = 0
    
    while(tf == true) {
        try {
            var str = next()
            count++
        }catch(e: Exception) {
            tf = false
        }
    }
    print(count)
}
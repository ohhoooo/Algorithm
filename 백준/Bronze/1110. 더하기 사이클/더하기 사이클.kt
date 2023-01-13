import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()
    var newNum = num
    var count = 0
    if(num == 0) print("1")
    else {
        do {
            newNum = ((newNum % 10) * 10) + ((newNum % 10 + newNum / 10) % 10)
            count++
        }while(num != newNum)
    
        print(count)
    }
}
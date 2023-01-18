import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val str = nextLine()
    val arr = Array(26, {-1})
    
    for(i in 0..str.length - 1)
        if(arr[str[i].toInt() - 97] == -1) arr[str[i].toInt() - 97] = i
        
    for(i in 0..arr.size - 2)
        print("${arr[i]} ")
    
    print("${arr[arr.size-1]}")
}
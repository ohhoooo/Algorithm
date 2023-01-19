import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
	val a = next().toUpperCase()
    val arr = Array<Int>(26, {0}) // 0은 A 26은 Z
    
    for(i in 0..a.length-1)
        arr[a[i].toInt()-65] += 1
    
    if(arr.filter { it == arr.max() }.size > 1) {
        print("?")
    }else {
        for(i in 0..arr.size-1)
            if(arr[i] == arr.max()) print((i + 65).toChar())
    }
}
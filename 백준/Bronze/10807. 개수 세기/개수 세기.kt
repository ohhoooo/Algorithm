import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    
    val a = nextInt() // 숫자 개수
    var arr = IntArray(a, {0}) // 숫자 넣을 배열 초기화
    var count = 0 // 카운트 할 변수
    
    for(i in 1..a) {
        arr[i-1] = nextInt()
    }
    
    val countNum = nextInt() // 개수를 새야 하는 숫자
    
    for(j in 1..a) {
        if(countNum == arr[j-1]) {
            count++
        }
    }
    
    print(count)
}
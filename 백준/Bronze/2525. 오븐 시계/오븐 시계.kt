import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt() // 현재 시
    val b = nextInt() // 현재 분
    val c = nextInt() // 설정
    val d = c / 60 // 설정 시간
    val e = c % 60 // 설정 분
    
    if(b+e < 60) { // 분 합계가 60분 초과 x
        if(a+d > 23) print("${a+d-24} ${b+e}")
        else print("${a+d} ${b+e}")
    }else { // 분 합계가 60분 초과 o
        if(a+d+1 > 23) print("${a+d+1-24} ${b+e-60}")
        else print("${a+d+1} ${b+e-60}")
    }
}
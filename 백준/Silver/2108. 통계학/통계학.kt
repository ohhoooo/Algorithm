import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val list = mutableListOf<Int>()
    val map = mutableMapOf<Int, Int>()
    var sum = 0
    var maxSizeNum = 0
    var maxSizeNumCount = 0
    var LowNum2 = 0
    
    repeat(readLine().toInt()) {
        val num = readLine().toInt()
        list.add(num)
        if(map[num] == null) map.put(num, 1)
        else map.put(num, map[num]!!+1)
    }
    
    for(i in list) sum += i
    if(sum >= 0) {
        if(sum.toDouble()/list.size.toDouble()-sum/list.size >= 0.5) {
    		println(sum/list.size + 1)
    	}else println(sum/list.size)
    }else {
        if(sum.toDouble()/list.size.toDouble()-sum/list.size < -0.5) {
    		println(sum/list.size - 1)
    	}else println(sum/list.size)
    } // 산술평균
    
    list.sort()
    println(list[list.size/2]) // 중앙값
    
    for(i in map.keys) {
        if(map[i]!! > maxSizeNumCount) {
            maxSizeNum = i
            maxSizeNumCount = map[i]!!
        }
    }
    
    val newMap = map.toSortedMap()
    
    for(i in newMap.keys) {
        if(map[i] == maxSizeNumCount) ++LowNum2
        if(LowNum2 == 2) {
            println(i)
            break
        }
    }
    
    if(LowNum2 != 2) println(maxSizeNum) // 최빈값
    
    print(list.max()-list.min()) // 범위
}
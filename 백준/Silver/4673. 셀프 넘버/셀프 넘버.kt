fun main(args: Array<String>) {
    var num = 1 // 기준 숫자
    var one = 0 // 1의자리 숫자
    var ten = 0 // 10의자리 숫자
    var hdd = 0 // 100의자리 숫자
    var tsd = 0 // 1000의자리 숫자
    var list = mutableListOf<Int>()
    val newList = mutableListOf<Int>()
    
    while(num <= 10000) {
        if(num < 10) {
            list.add(num + num)
        }else if(num < 100) {
            one = num % 10
            ten = num / 10
            list.add(num + one + ten)
        }else if(num < 1000) {
            one = num % 10
            ten = ((num % 100) - one) / 10
            hdd = num / 100
            list.add(num + one + ten + hdd)
        }else if(num < 10000) {
            one = num % 10
            ten = ((num % 100) - one) / 10
            hdd = ((num % 1000) - one - (ten * 10)) / 100
            tsd = num / 1000
            list.add(num + one + ten + hdd + tsd)
        }
        num++
    }
    
    for(i in 1..10000)
        if(i !in list) newList.add(i)
    
    for(i in 0..(newList.size - 1))
        println(newList[i])
}
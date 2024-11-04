func solution(_ n: Int, _ a: Int, _ b: Int) -> Int {
    var max = (a > b) ? a : b
    var min = (a > b) ? b : a
    var ans = 1
    
    while true {
        if max - min == 1 && max % 2 == 0 && min % 2 == 1 {
            return ans
        } else {
            max = (max % 2 == 0) ? max / 2 : (max + 1) / 2
            min = (min % 2 == 0) ? min / 2 : (min + 1) / 2
            ans += 1
        }
    }
    
    return ans
}
func solution(_ a:Int, _ b:Int) -> String {
    let week = ["THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"]
    
    return week[getDay(a, b)]
}

func getDay(_ a: Int, _ b: Int) -> Int {
    let calendar = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    var day = 0
    
    for i in 0...a-1 {
        day += (i == a-1) ? b : calendar[i]
    }
    
    return day % 7
}
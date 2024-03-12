func solution(_ a:Int, _ b:Int, _ n:Int) -> Int {
    var answer = 0
    var emptyBottle = n
    
    while emptyBottle >= a {
        answer += emptyBottle / a * b
        emptyBottle = emptyBottle / a * b + (emptyBottle - emptyBottle / a * a)
    }

    return answer
}
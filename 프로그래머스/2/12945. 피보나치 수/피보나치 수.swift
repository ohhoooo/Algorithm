func solution(_ n:Int) -> Int {
    var fibonacciNumbers = [0, 1]
    var count = 2
    
    while n >= count {
        fibonacciNumbers.append((fibonacciNumbers[0] + fibonacciNumbers[1]) % 1234567)
        fibonacciNumbers.remove(at: 0)
        count += 1
    }
    
    return fibonacciNumbers[1]
}
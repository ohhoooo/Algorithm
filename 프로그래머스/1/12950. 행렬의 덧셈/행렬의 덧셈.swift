func solution(_ arr1: [[Int]], _ arr2: [[Int]]) -> [[Int]] {
    var answer: [[Int]] = []
    
    for i in 0...arr1.count-1 {
        var arr: [Int] = []
        
        for j in 0...arr1[i].count-1 {
            arr.append(arr1[i][j] + arr2[i][j])
        }
        answer.append(arr)
    }
    
    return answer
}
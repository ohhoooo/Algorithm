func solution(_ arr: [Int]) -> Int {
    var leastCommonMultiple = arr.max()!
    var multiple = 1
    var check = true
    
    while check {
        for i in 0..<arr.count {
            if leastCommonMultiple % arr[i] != 0 {
                multiple += 1
                leastCommonMultiple = arr.max()! * multiple
                break
            }
            
            if i == arr.count - 1 {
                check = false
            }
        }
    }
    
    return leastCommonMultiple
}
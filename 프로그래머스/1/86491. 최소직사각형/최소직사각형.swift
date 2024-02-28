func solution(_ sizes:[[Int]]) -> Int {
    var maxSize = 0
    var minSize = 0
    
    for size in sizes {
        let max = size[0] > size[1] ? size[0] : size[1]
        let min = size[0] > size[1] ? size[1] : size[0]
        
        if maxSize < max {
            maxSize = max
            minSize = min
        }
    }
    
    for size in sizes {
        let min = size[0] > size[1] ? size[1] : size[0]
        
        if min > minSize {
            minSize = min
        }
    }

    return maxSize * minSize
}
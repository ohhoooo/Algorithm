func solution(_ brown: Int, _ yellow: Int) -> [Int] {
    var width = (brown - 2) / 2
    var height = 3

    while true {
        if (width - 2) * (height - 2) == yellow {
            return [width, height]
        } else {
            width -= 1
            height += 1
        }
    }
}
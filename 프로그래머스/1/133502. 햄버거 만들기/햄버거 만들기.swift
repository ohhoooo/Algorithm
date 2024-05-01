func solution(_ ingredient:[Int]) -> Int {
    var answer = 0
    var ingredients = [Int]()
    
    for i in ingredient {
        ingredients.append(i)
        
        if ingredients.count >= 4 {
            if ingredients[ingredients.count-4...ingredients.count-1] == [1,2,3,1] {
                ingredients.removeSubrange(ingredients.count-4...ingredients.count-1)
                answer += 1
            }
        }
    }
    
    return answer
}
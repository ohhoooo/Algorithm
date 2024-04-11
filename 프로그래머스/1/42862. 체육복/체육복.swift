func solution(_ n:Int, _ lost:[Int], _ reserve:[Int]) -> Int {
    var answer = 0
    var lostStudents = lost.sorted()
    var reserveStudents = reserve.sorted()
    
    for i in lostStudents {
        if reserveStudents.contains(i) {
            removeStudent(&lostStudents, i, &reserveStudents, i)
        }
    }
    
    for i in lostStudents {
        if reserveStudents.contains(i-1) {
            removeStudent(&lostStudents, i, &reserveStudents, i-1)
        } else if reserveStudents.contains(i+1) {
            removeStudent(&lostStudents, i, &reserveStudents, i+1)
        }
    }
    
    return n-lostStudents.count
}

func removeStudent(_ lostStudents: inout [Int], _ lostStudent: Int, _ reserveStudents: inout [Int], _ reserveStudent: Int) {
    lostStudents.remove(at: getIndex(lostStudents, lostStudent))
    reserveStudents.remove(at: getIndex(reserveStudents, reserveStudent))
}

func getIndex(_ students: [Int], _ student: Int) -> Int {
    return students.firstIndex(of: student)!
}
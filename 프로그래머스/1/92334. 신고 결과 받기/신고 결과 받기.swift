func solution(_ id_list:[String], _ report:[String], _ k:Int) -> [Int] {
    var answer = [Int]()
    var reportees = [String: Int]()
    var reporters = [String: [String]]()
    
    Set(report).forEach {
        let info = $0.components(separatedBy: " ")
        let reporter = info[0], reportee = info[1]
        
        if let _ = reportees[reportee] {
            reportees[reportee]! += 1
        } else {
            reportees[reportee] = 1
        }
        
        if let _ = reporters[reporter] {
            reporters[reporter]!.append(reportee)
        } else {
            reporters[reporter] = [reportee]
        }
    }
    
    let filteredReportees = reportees.filter { $0.value >= k }.keys
    
    for id in id_list {
        var count = 0
        
        if let emailList = reporters[id] {
            emailList.forEach {
                if filteredReportees.contains($0) {
                    count += 1
                }
            }
        }
        
        answer.append(count)
    }
    
    return answer
}
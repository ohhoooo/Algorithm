import Foundation

func solution(_ new_id:String) -> String {
    let processOne = new_id.lowercased().map { String($0) }
    var processTwo: [String] = []
    
    for s in processOne {
        let ascii = Int(UnicodeScalar(s)!.value)
        
        if (ascii >= 97 && ascii <= 122) || (ascii >= 48 && ascii <= 57) || ascii == 45 || ascii == 46 || ascii == 95 {
            processTwo.append(s)
        }
    }
    
    var processThree: [String] = []
    
    if processTwo.count > 0 {
        for s in processTwo {
            if processThree.count > 0 {
                if !(processThree[processThree.count-1] == "." && s == ".") {
                    processThree.append(s)
                }
            } else {
                processThree.append(s)
            }
        }
    }
    
    var processFour: [String] = []
    
    if processThree.count > 0 {
        for i in 0..<processThree.count {
            if !(processFour.isEmpty && processThree[i] == ".") {
                processFour.append(processThree[i])
            }
        }
    }
    
    if processFour.count > 0 {
        for i in stride(from: processFour.count-1, to: 0, by: -1) {
            if processFour.count-1 == i && processFour[i] == "." {
                processFour.remove(at: i)
            } else {
                break
            }
        }
    }
    
    var processFive: [String] = []
    
    processFive = (processFour.isEmpty) ? ["a"] : processFour
    
    var processSix: [String] = []
    
    if processFive.count > 15 {
        processFive.removeSubrange(15..<processFive.count)
        
        for i in stride(from: processFive.count-1, to: 0, by: -1) {
            if processFive.count-1 == i && processFive[i] == "." {
                processFive.remove(at: i)
            }
        }
    }
    
    processSix = processFive
    
    var processSeven: [String] = []
    
    if processSix.count < 3 {
        while processSix.count < 3 {
            processSix.append(processSix[processSix.count-1])
        }
    }
    
    processSeven = processSix
    
    return processSeven.joined(separator: "")
}
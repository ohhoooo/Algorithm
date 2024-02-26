func solution(_ s:String) -> String {
    return s.map { String($0) }.sorted { Int(UnicodeScalar($0)!.value) > Int(UnicodeScalar($1)!.value) }.joined()
}
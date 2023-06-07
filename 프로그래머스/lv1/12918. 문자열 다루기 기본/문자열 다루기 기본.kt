class Solution {
    fun solution(s: String): Boolean {

    val size = s.split("").filter { it == "0" || it == "1" || it == "2" || it == "3" || it == "4" || it == "5" || it == "6" || it == "7" || it == "8" || it == "9"}.size
    
    return s.length == size && (s.length == 4 || s.length == 6)
}
}
class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var cola = n
        var accumulateCola = 0

        while(cola >= a) {
            accumulateCola += (cola / a) * b
            cola = (cola / a) * b + cola % a
        }

        return accumulateCola
    }
}
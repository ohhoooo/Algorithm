class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var max = 0
        var min = 0

        for(i in sizes.indices) {
            val sizeMax = if(sizes[i].first() >= sizes[i].last()) sizes[i].first() else sizes[i].last()
            val sizeMin = if(sizes[i].first() >= sizes[i].last()) sizes[i].last() else sizes[i].first()

            if(sizeMax > max) max = sizeMax
            if(sizeMin > min) min = sizeMin
        }

        return  max * min
    }
}
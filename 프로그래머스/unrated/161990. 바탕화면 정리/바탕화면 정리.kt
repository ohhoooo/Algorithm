class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        val answer = IntArray(4) { -1 }
        answer[0] = getX(0, wallpaper, true)
        answer[2] = getX(wallpaper.size - 1, wallpaper, false) + 1

        loop@ for (i in 0 until wallpaper[0].length) {
            for (j in wallpaper.indices) {
                if (wallpaper[j][i] == '#') {
                    answer[1] = i
                    break@loop
                }
            }
        }

        loop@ for (i in wallpaper[0].length - 1 downTo 0) {
            for (j in wallpaper.indices) {
                if (wallpaper[j][i] == '#') {
                    answer[3] = i + 1
                    break@loop
                }
            }
        }
        return answer
    }

    fun getX(size: Int, wallpaper: Array<String>, plus: Boolean): Int {
        var size = size

        while (true) {
            if (wallpaper[size].contains('#')) return size else if (plus) size++ else size--
        }
    }
}
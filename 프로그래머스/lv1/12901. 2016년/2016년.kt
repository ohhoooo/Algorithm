class Solution {
    fun solution(a: Int, b: Int): String {
        val day = monthToDate(a) + b
        return dateToDay(day%7)
    }

    fun monthToDate(month: Int): Int {
        return when(month) {
            1 -> 0
            2 -> 31
            3 -> 60
            4 -> 91
            5 -> 121
            6 -> 152
            7 -> 182
            8 -> 213
            9 -> 244
            10 -> 274
            11 -> 305
            else -> 335
        }
    }

    fun dateToDay(date: Int): String {
        return when(date) {
            0 -> "THU"
            1 -> "FRI"
            2 -> "SAT"
            3 -> "SUN"
            4 -> "MON"
            5 -> "TUE"
            else -> "WED"
        }
    }
}
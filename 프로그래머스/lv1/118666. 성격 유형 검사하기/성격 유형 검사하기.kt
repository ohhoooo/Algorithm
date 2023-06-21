class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val answer = StringBuilder()
        val map = mutableMapOf(
            'R' to 0, 'T' to 0, 'C' to 0, 'F' to 0,
            'J' to 0, 'M' to 0, 'A' to 0, 'N' to 0
        )

        for (i in choices.indices) {
            when (choices[i]) {
                1, 2, 3 -> addMap(survey[i].first(), choices[i], map)
                5, 6, 7 -> addMap(survey[i].last(), choices[i], map)
            }
        }

        if(map['R']!! >= map['T']!!) answer.append('R') else answer.append('T')
        if(map['C']!! >= map['F']!!) answer.append('C') else answer.append('F')
        if(map['J']!! >= map['M']!!) answer.append('J') else answer.append('M')
        if(map['A']!! >= map['N']!!) answer.append('A') else answer.append('N')

        return answer.toString()
    }

    fun addMap(survey: Char, choices: Int, map: MutableMap<Char, Int>) {
        when (choices) {
            1,7 -> map[survey] = map[survey]!!.plus(3)
            2,6 -> map[survey] = map[survey]!!.plus(2)
            3,5 -> map[survey] = map[survey]!!.plus(1)
        }
    }
}
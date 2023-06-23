class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val answer = mutableListOf<Int>()
        val todayArr = today.split(".").map { it.toInt() }

        for (i in privacies.indices) {
            val privaciesArr = privacies[i].split(" ")

            val previousDate = privaciesArr[0].split(".").map { it.toInt() }.toMutableList()
            val alphabet = privaciesArr[1]

            for (term in terms) {
                val termAlphabet = term.split(" ")[0]
                val termNumber = term.split(" ")[1].toInt()

                if (termAlphabet == alphabet) {
                    if (termNumber + previousDate[1] > 12) {
                        val year = (termNumber + previousDate[1]) / 12
                        val month = (termNumber + previousDate[1]) % 12
                        
                        if(month == 0) {
                            previousDate[0] += year - 1
                            previousDate[1] = 12
                        }else {
                            previousDate[0] += year
                            previousDate[1] = month
                        }

                        if (compareToday(todayArr, previousDate)) answer.add(i+1)
                    } else {
                        previousDate[1] += termNumber

                        if (compareToday(todayArr, previousDate)) answer.add(i+1)
                    }
                    break
                }
            }
        }
        return answer.toIntArray()
    }

    fun compareToday(today: List<Int>, dateOfConsent: MutableList<Int>): Boolean {
        return if (today[0] > dateOfConsent[0]) {
            true
        } else if (today[0] == dateOfConsent[0] && today[1] > dateOfConsent[1]) {
            true
        } else (today[0] == dateOfConsent[0] && today[1] == dateOfConsent[1] && today[2] >= dateOfConsent[2])
    }
}
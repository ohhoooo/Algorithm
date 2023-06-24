class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val answer = IntArray(id_list.size) { 0 }
        val reportList = mutableMapOf<String, MutableSet<String>>()

        for (r in report) {
            val reporter = r.split(" ").first()
            val reportee = r.split(" ").last()

            if(reportList[reportee] == null) {
                reportList[reportee] = mutableSetOf(reporter)
            }else {
                reportList[reportee]!!.add(reporter)
            }
        }

        val listSet = reportList.filter { it.value.size >= k }.map { it.value }

        listSet.forEach {
            for (i in it) {
                answer[id_list.indexOf(i)]++
            }
        }
        return answer
    }
}
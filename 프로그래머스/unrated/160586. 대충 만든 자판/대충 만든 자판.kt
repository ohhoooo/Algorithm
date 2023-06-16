class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val answer = IntArray(targets.size) { -1 }

        for (i in targets.indices) {
            var count = 0

            for (j in targets[i]) {
                var index = 0

                if (keymap.count { it.contains(j) } == 0) {
                    count = -1
                    break
                }

                val list = keymap.filter { it.contains(j) }

                while (true) {
                    if (list.count { it[index] == j } > 0) {
                        count += index+1
                        break
                    }else {
                        index++
                    }
                }
            }
            answer[i] = count
        }
        return answer
    }
}
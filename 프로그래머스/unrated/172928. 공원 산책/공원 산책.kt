class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val answer = IntArray(2) { -1 }

        loop@ for (i in park.indices) {
            for (j in 0 until park[i].length) {
                if (park[i][j] == 'S') {
                    answer[0] = i
                    answer[1] = j
                    break@loop
                }
            }
        }

        for (route in routes) {
            val r = route.split(" ")
            moveDirection(r, park, answer)
        }

        return answer
    }

    fun moveDirection(route: List<String>, park: Array<String>, answer: IntArray) {
        when (route.first()) {
            "N" -> {
                if(answer[0]-route[1].toInt() >= 0) {
                    var condition = true

                    for(i in answer[0]-1 downTo answer[0]-route[1].toInt()) {
                        if(park[i][answer[1]] == 'X') {
                            condition = false
                            break
                        }
                    }

                    if(condition) answer[0] -= route[1].toInt()
                }
            }
            "W" -> {
                if(answer[1]-route[1].toInt() >= 0) {
                    var condition = true

                    for(i in answer[1]-1 downTo answer[1]-route[1].toInt()) {
                        if(park[answer[0]][i] == 'X') {
                            condition = false
                            break
                        }
                    }

                    if(condition) answer[1] -= route[1].toInt()
                }
            }
            "E" -> {
                if(answer[1]+route[1].toInt() < park[0].length) {
                    var condition = true

                    for(i in answer[1]+1..answer[1]+route[1].toInt()) {
                        if(park[answer[0]][i] == 'X') {
                            condition = false
                            break
                        }
                    }

                    if(condition) answer[1] += route[1].toInt()
                }
            }
            "S" -> {
                if(answer[0]+route[1].toInt() < park.size) {
                    var condition = true

                    for(i in answer[0]+1..answer[0]+route[1].toInt()) {
                        if(park[i][answer[1]] == 'X') {
                            condition = false
                            break
                        }
                    }
                    if(condition) answer[0] += route[1].toInt()
                }
            }
        }
    }
}
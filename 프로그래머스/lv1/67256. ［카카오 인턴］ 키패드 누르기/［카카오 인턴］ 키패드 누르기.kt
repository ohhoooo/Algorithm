class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        val answer = StringBuilder()
        var leftHand = -1
        var rightHand = -1

        for (i in numbers) {
            when(i) {
                1, 4, 7 -> {
                    answer.append("L")
                    leftHand = i
                }
                3, 6, 9 -> {
                    answer.append("R")
                    rightHand = i
                }
                else -> {
                    if(fingerDistance(leftHand, i) > fingerDistance(rightHand, i)) {
                        answer.append("R")
                        rightHand = i
                    }else if (fingerDistance(leftHand, i) < fingerDistance(rightHand, i)) {
                        answer.append("L")
                        leftHand = i
                    }else {
                        if (hand == "left") {
                            answer.append("L")
                            leftHand = i
                        }else {
                            answer.append("R")
                            rightHand = i
                        }
                    }
                }
            }
        }
        return answer.toString()
    }

    fun fingerDistance(hand: Int, destination: Int): Int {
        return when(destination) {
            2 -> {
                when(hand) {
                    -1 -> 4
                    0, 7, 9 -> 3
                    4, 6, 8 -> 2
                    1, 3, 5 -> 1
                    else -> 0
                }
            }
            5 -> {
                when(hand) {
                    -1 -> 3
                    0, 1, 3, 7, 9 -> 2
                    2, 4, 6, 8 -> 1
                    else -> 0
                }
            }
            8 -> {
                when(hand) {
                    1, 3 -> 3
                    -1, 2, 4, 6 -> 2
                    0, 5, 7, 9 -> 1
                    else -> 0
                }
            }
            else -> {
                when(hand) {
                    1, 3 -> 4
                    2, 4, 6 -> 3
                    5, 7, 9 -> 2
                    -1, 8 -> 1
                    else -> 0
                }
            }
        }
    }
}
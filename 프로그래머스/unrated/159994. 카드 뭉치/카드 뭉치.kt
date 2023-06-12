class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        val firstCard = cards1.toMutableList()
        val secondCard = cards2.toMutableList()

        for(i in goal.indices) {
            if(firstCard.size > 0 && firstCard[0] == goal[i]) {
                firstCard.removeAt(0)
            }else if(secondCard.size > 0 && secondCard[0] == goal[i]) {
                secondCard.removeAt(0)
            }else {
                return "No"
            }
        }
        return "Yes"
    }
}
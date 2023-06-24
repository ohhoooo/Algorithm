class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val map = mutableMapOf<String, Int>()
        var callingIndex: Int

        for (i in callings.indices) {
            if (map[callings[i]] == null) {
                callingIndex = players.indexOf(callings[i])

                players[callingIndex] = players[callingIndex - 1]
                map[players[callingIndex - 1]] = callingIndex

                players[callingIndex - 1] = callings[i]
                map[callings[i]] = callingIndex - 1
            } else {
                callingIndex = map[callings[i]]!!

                players[callingIndex] = players[callingIndex - 1]
                map[players[callingIndex - 1]] = callingIndex

                players[callingIndex - 1] = callings[i]
                map[callings[i]] = callingIndex - 1
            }
        }
        return players
    }
}
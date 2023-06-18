class Solution {
    fun solution(new_id: String): String {
        var answer = new_id.lowercase().run {
            replace(Regex("[^a-z\\d\\-_.]*"), "")
                .replace(Regex("[.]+"), ".")
                .replace(Regex("^[.]|[.]$"), "")
        }

        if (answer.isEmpty()) answer = "a"

        if (answer.length >= 16) answer = answer.substring(0..14)
        answer = answer.replace(Regex("[.]$"), "")

        while (answer.length < 3) { answer += answer[answer.length-1] }

        return answer
    }
}
class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var price = price.toLong()
        var firstPrice = price
        var money = money.toLong()

        repeat(count) {
            money -= price
            price += firstPrice
        }

        return if(money >= 0) 0 else -money
    }
}
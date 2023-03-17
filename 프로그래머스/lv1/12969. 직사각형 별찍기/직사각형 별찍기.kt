fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    
    repeat(b) {
        repeat(a) {
            print("*")
            if(it == a-1) print("\n")
        }
    }
}
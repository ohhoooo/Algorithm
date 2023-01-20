import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var numFst = nextInt()
    var numSec = nextInt()
    
    numFst = (numFst % 10) * 100 + (numFst % 100) / 10 * 10 + numFst / 100
    numSec = (numSec % 10) * 100 + (numSec % 100) / 10 * 10 + numSec / 100
    
    if(numFst > numSec) print(numFst)
    else print(numSec)
}
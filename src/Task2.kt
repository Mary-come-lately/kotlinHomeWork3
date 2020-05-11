
import kotlin.random.Random

fun main(args:Array<String>){
     //bubble sort
    var massiv = Array(5){ Random.nextInt(0,100)}
    var i: Int  = 0
    for (i in massiv){
        print("$i" + " ")
    }

    for (i in 0 until  massiv.size){
        for (j in 0 until  massiv.size-1){
            if(massiv[j] > massiv[j+1]){
                var tmp = massiv[j]
                massiv[j] = massiv[j+1]
                massiv[j+1] = tmp
            }
        }
    }
    println()
    for (i in massiv){
        print("$i" + " ")
    }


}
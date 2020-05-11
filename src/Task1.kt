import java.util.*
import kotlin.math.max
import kotlin.random.Random

fun main(args: Array<String>){
    var massiv = Array(5){ Random.nextInt(0,100)}
    var i: Int = 0
    for(i in massiv){
      print("$i" + " ")
    }
println()
    //max value
    massiv.sort()
    var valMax = massiv[massiv.size-1]
    println("max value of array " + "$valMax")

    //min value
    massiv.sortedArray()
    var valMin: Int = massiv[0]
    println("min value of array " + "$valMin")

    //middle value
    var valMiddle : Double = 0.0
    for (i in massiv) {
        valMiddle = massiv.sum().toDouble()/ massiv.size
    }
    println(valMiddle)
}





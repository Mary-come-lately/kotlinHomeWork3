import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

fun main(args: Array<String>){
    var massiv: ArrayList<Int> = arrayListOf<Int>()
    for (i in 1..10){
        massiv.add(Random.nextInt(1,50))
    }
   println(massiv)

    var scan = Scanner(System.`in`)
    print("Please, enter the number:  ")
    var number: Int = scan.nextInt()

    var massive2 = ArrayList(massiv)
    for (i in massiv){
        if (i == number)
      massive2.remove(i)
    }

    println(massive2)
}



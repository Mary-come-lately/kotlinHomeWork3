import kotlin.random.Random

fun main(args: Array<String>){
    var vector = Vector(4.0, 6.0, 10.0)
    var vector2 = Vector(12.0, 4.0, 9.0)

    //длина
    println(vector.vectolLength())

    //скалярное произведение
    println(vector.scalarProduct(vector2))

    //угол
    println(vector.angleBetweenVectors(vector,vector2))

    //умножить / сложить / вычесть
    println(vector.times(vector2))
    println(vector.plus(vector2))
    println(vector.minus(vector2))

    var number: Int = Random.nextInt(5,10)
    var vectors = vector.arrayVectors(number)
    for (vector in vectors){
        println("$vector" + " ")
    }



}

fun main(args: Array<String>){
    var vector = Vector(4.0, 6.0, 10.0)
    var vector2 = Vector(12.0, 4.0, 9.0)
    println(vector.vectolLength())

    println(vector.scalarProduct(vector2))


    println(vector.angleBetweenVectors(vector,vector2))
}
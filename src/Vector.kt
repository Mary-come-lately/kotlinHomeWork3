import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

public class Vector (var x: Double, var y: Double, var z:Double){


fun vectolLength(): Double {
    var length = sqrt((x.pow(2)+y.pow(2)+z.pow(2)))
    return length
}

    fun scalarProduct(vector: Vector): Double {

        var scalarProd = ((this.x*vector.x)+(this.y*vector.y)+(this.z+vector.z))
        return scalarProd
    }

    operator fun times(vector: Vector): Vector = Vector(
        this.y*vector.z - this.z*vector.y,
        this.z*vector.x - this.x*vector.z,
        this.x*vector.y - this.y*vector.x
        )

    fun angleBetweenVectors(vector: Vector, vector2: Vector): Double{
        var result = scalarProduct(vector)/ abs(vector.vectolLength()) * abs(vector2.vectolLength())
        return result
    }


}
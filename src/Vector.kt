import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random



class Vector (var x: Double, var y: Double, var z:Double){

    override fun toString(): String {
        return "x = $x  y = $y  z = $z"
    }

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

    operator fun plus(vector: Vector): Vector = Vector(
        this.y+vector.y,
        this.z*vector.z,
        this.x*vector.x
    )

    operator fun minus(vector: Vector): Vector = Vector(
        this.y-vector.y,
        this.z-vector.z,
        this.x-vector.x
    )

    fun arrayVectors(number: Int): Array<Vector> {
            var mass = Array(number){ Vector(Random.nextDouble(1.0,100.00),
                Random.nextDouble(1.0, 100.0),
                Random.nextDouble(1.0,100.0))}
            return mass
        }
}
import kotlin.random.Random

fun main(args: Array<String>){
  for (i in 2..100){
      if (isPrime(i))
      print("$i" +" ")
  }
    }

fun isPrime(number: Int) : Boolean
{

    if (number <= 1)
    {
        return false;
    }

    // The check for the number 2 and 3
    if (number <= 3)
    {
        return true;
    }

    if (number%2 == 0 || number%3 == 0)
    {
        return false;
    }

    for (i in 5..number/2 step 6)
    {

        if (number%i == 0 || number%(i+2) == 0)
        {
            return false;
        }
    }
    return true;
}
import java.util.Random
fun main(){
    /*
       Fecha:26/01/2022
       Versión: 1.0
       Autor: Miguel Ángel Reyes Tortosa
       Centro: I.E.S Rafael Alberti
       Ejercicio: Actividad 5: ejercicios Kotlin inicial/ Ejercicio 2
     */
    var random = Random()
    var array1= arrayListOf<Int>()
    var impares= arrayListOf<Int>()
    while (array1.count()<20){
        var indice:Int =0
        array1.add(indice, random.nextInt(50))
        indice+=1}
    for (i in array1){
        if (i%2 ==0){
            println(i)
        }
}
    array1.sort()
    println("Último número: ${array1[19]}")
    println("Primer número: ${array1[0]}")
    println("Suma: ${array1.sum()}")

    println("Elementos Restantes: $array1")
    for (i in array1){
        if (i%2!=0){
            impares.add(i)
        }
    }
    for (i in impares){
        if (i in array1){
            array1.remove(i)
        }
    }
    println("Elementos Restantes: $array1")
    }

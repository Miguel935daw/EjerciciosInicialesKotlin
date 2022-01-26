fun main() {
  /*
    Fecha:26/01/2022
    Versión: 1.0
    Autor: Miguel Ángel Reyes Tortosa
    Centro: I.E.S Rafael Alberti
    Ejercicio: Actividad 5: ejercicios Kotlin inicial/ Ejercicio 1
   */
    Notas()
}
fun Notas() {
    println("Introduce la nota del alumno: ")
    val nota: Int = readLine()!!.toInt()
    when (nota) {
        in 0..4 -> {
            println("Suspenso")
        }
        in 5..6 -> {
            println("Aprobado")
        }
        in 7..8 -> {
            println("Notable")
        }
        in 9..10 -> {
            println("Sobresaliente")
        }
        else -> {
            println("El valor introducido no es correcto")
        }
    }
}

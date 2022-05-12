fun main(args: Array<String>) {
	val a: Float = 10.5f
	val b: Int = 5

	println("a es float ($a)")
	println("b es int ($b)")

	// Esto no funciona
	//val resultado =  a + b

	//Esto sí
	val resultado = a.toInt() + b

	println("Antes de hacer la suma convierte \"a\" a int")
	println("float $a -> int ${a.toInt()}")

	println("Suma: $resultado")

	val vel = velocidad(10, 5)
	println("ando corriendo a $vel km/h")
}

fun velocidad(distanciaKm: Int, tiempoHoras: Int): Int = distanciaKm / tiempoHoras
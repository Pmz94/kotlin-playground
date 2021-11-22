fun main(args: Array<String>) {
	val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

	for(valor in weekDays.indices) {
		println(weekDays[valor])
	}

	for((posicion, valor) in weekDays.withIndex()) {
		println("La posicion $posicion tiene el valor $valor")
	}

	for(weekDay in weekDays) {
		println(weekDay)
	}

	// val mutableList: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")
	val mutableList: MutableList<String> = weekDays.toMutableList()
	val newListEmpty: MutableList<String> = mutableListOf()
	mutableList.forEach { newListEmpty.add("$it:") }
	print(newListEmpty)
}
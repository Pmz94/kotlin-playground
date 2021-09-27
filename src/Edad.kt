import java.util.*

fun main(args: Array<String>) {
	val edad = getAge(1994, 8, 9)
	println(edad)
}

fun getAge(year: Int, month: Int, day: Int): Int {
	val dob = Calendar.getInstance()
	val today = Calendar.getInstance()

	dob[year, month] = day
	var age = today[Calendar.YEAR] - dob[Calendar.YEAR]
	if (today[Calendar.DAY_OF_YEAR] < dob[Calendar.DAY_OF_YEAR]) {
		age--
	}
	return age
}
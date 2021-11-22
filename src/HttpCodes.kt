fun main(args: Array<String>) {
    val code = 205
    println("Que significa este status code? $code")
    val reason = getStatusReason(code)
    println(reason)
}

fun getStatusReason(code: Int): String {
    val reason: String = when(code) {
        200 -> "OK"
        201 -> "Created"
        202 -> "Accepted"
        400 -> "Bad Request"
        401 -> "Forbidden"
        404 -> "Not Found"
        else -> "No se"
    }
    return reason
}
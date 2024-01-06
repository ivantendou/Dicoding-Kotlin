// 02 - Expression and Statement

fun main() {
    val openOffice = 7
    val now = 8
    // if is statement
    if (now > openOffice) {
        print("Office already open")
    } else {
        print("Office close")
    }

    // but in Kotlin, if can be expression too
    val office = if (now > openOffice) "Office already open" else "Office close"
    print(office)

    // expression = statement that return the value
}

// 08 - Numbers

val intNumber = 100 // 32 bit

val longNumber: Long = 100 // 64 bit
val longNumber = 100L

val shortNumber: Short = 10 // 16 bit

val byteNumber = 0b11010010 // 8 bit

val doubleNumber: Double = 1.3 // Double (64 bit)

val floatNumber: Float = 0.123456789f    // Float (32 bit) yang terbaca hanya 0.1234567

/*
  how to convert the value 
  toByte(): Byte
  toShort(): Short
  toInt(): Int
  toLong(): Long
  toFloat(): Float
  toDouble(): Double
  toChar(): Char
*/

val byteNumber: Byte = 10
val intNumber: Int = byteNumber.toInt() // ready to go

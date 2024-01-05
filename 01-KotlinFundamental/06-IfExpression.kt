// 06 - If Expression

val openHours = 7
val now = 7
val office: String

office = if (now > 7) {
  // if variable now is greater that 7, this block will be executed.
    "Office already open"
} else if (now == openHours){
  // if first condition (now > 7) is wrong, the we'll check the seconds (now == openHours), then this block will be executed.
    "Wait a minute, office will be open"
} else {
  // if all of above condition are wrong, this block will be executed.
    "Office is closed"
}

// print the String in variable office
print(office)

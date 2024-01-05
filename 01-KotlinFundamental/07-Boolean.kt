// 07 - Boolean

/*
  Boolean is data type that has value false/true.
  We can use relational operator for variable that has boolean value.
*/

val officeOpen = 7
val officeClosed = 16
val now = 20

// this is Conjuntion or AND (&&)
val isOpen = if (now >= officeOpen && now <= officeClosed){
    true
} else {
    false
}

print("Office is open : $isOpen")

/*
  Output : Office is open : false
*/


// this is Disjunction or OR (||)
val isClose = now < officeOpen || now > officeClosed

print("Office is closed : $isClose")
/*
  Output : Office is closed : true
*/


// this is Negation or NOT (!)
if (!isOpen) {
    print("Office is closed")
} else {
    print("Office is open")
}

/*
  Output : Office is open
*/

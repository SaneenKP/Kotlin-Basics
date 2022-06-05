class Box
(
	var length: Int = 1,
	var width: Int = 2,
	var height: Int = 1,
){
	

	fun getValue(){
		println("area = ${length*width*height}")

	}
}


fun main(){
	
	// Lets create a variable that can hold a box object.
	// but you have not yet created a box object.
	// then you can assign the new variable as null.

	var newBox : Box? =  null

	//the ? varibale tells the compiler that your object could have null.
	
	//you can easily reassign the variable with a new object.

	newBox = Box(100 , 200 , 300)
	newBox.getValue()
	

	//But if the object is not reassigned with a new value
	//it would still be null
	//since when declaration it is declared as optional variable.

	var newBox2 : Box? =  null

	//so you cannot call the method of an optional variable like this
	//if it is not reassigned
	//for that kotlin uses safe-call operator 
	
	newBox2?.getValue()

	//since the box2 is null , this above method is not called.
	//but if we reassign values to box2 and then call the same method.
	//we can see that safe-call operator allows the variable to call the method since it  is not null.

	newBox2 = Box(5 , 6 , 7)
	newBox2?.getValue()

	//This method is redundant here since we can clearly see the assignment of the object.
	//and figure out that the object is not null.
	//The method is surely useful for compile time reassignment.

}

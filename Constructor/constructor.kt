// class with empty constructor
class Box1{
	
	val length: Int = 10
	val width: Int = 20
	val height: Int = 100

	fun getValue(): Int{
		return length*width*height

	}
}

//class with a parameterized primary constructor
class Box2(
	val length: Int,
	val width: Int,
	val height: Int,
){

	fun getValue(): Int{
		return length*width*height

	}
}

fun main(){
	val box1 = Box1()
	val area = box1.getValue()
	println("area from empty constructor ${area}")

	//call the object with parameters
	val box2 = Box2(5 , 10 , 15)
	val area2 = box2.getValue()
	println("area from parameterized constructor ${area2}")
}

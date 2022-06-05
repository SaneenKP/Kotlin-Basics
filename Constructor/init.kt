class Box2(
	val length: Int,
	val width: Int,
	val height: Int,
){
	
	//init block is called whenever an object is created.
	init{
		println("init block called with length = ${length} , width = ${width} , height = ${height}")

	}	

	fun getValue(): Int{
		return length*width*height

	}
}

fun main(){
	val box2 = Box2(5 , 10 , 15)
	val area2 = box2.getValue()
	println("area from parameterized constructor ${area2}")
}

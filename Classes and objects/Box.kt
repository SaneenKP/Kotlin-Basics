class Box{
	
	val length: Int = 10
	val width: Int = 20
	val height: Int = 100

	fun getValue(): Int{
		return length*width*height

	}
}

fun main(){
	val box1 = Box()
	val area = box1.getValue()
	println(area)
}

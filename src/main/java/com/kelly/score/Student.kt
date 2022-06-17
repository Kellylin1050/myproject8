package com.kelly.com.kelly.score

class Student(var name:String, var english:Int, var math: Int){
    init {
        println("Testing")
    }
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}")
    }
    fun getAverage() = (english+math)/2
}
fun main(){
    val Jack = Student("Jack",25,79)
    println(Jack.math)
}
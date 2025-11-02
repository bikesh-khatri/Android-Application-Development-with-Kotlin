package com.example.firstkotlin
fun main(){
    val number: MutableList<Int> =mutableListOf(2,4,6,8,10)
    val name: List<String> = listOf("anil","rhytham","rajan","bikki")
    number.add(22)
    number.add(2,100)
    number.remove(0)
    number.remove(number[2])
    println(number)
    println(name)
    println(name[2])
    println(name.get(3))
}
package com.example.firstkotlin
fun main(){
    val name: MutableList<String> =mutableListOf("ram","shyam","hari", "geeta")//Mutable list
    val number:List<Int> =listOf(1,2,3,4,5,6,7)//immutable list
    val name2= setOf(1,2,3,4,"hari")
    println(name2)
    println(name2.contains("hari"))

    println(number)
    println(number[2])
    println(number.get(3))
    name.add("bikki")
    name.remove(name[1])
    println(name)
    println(name.size)
    println(name[2])
    println(name.get(3))
}

package com.example.firstkotlin

/*Create a Dictionary app using mapOf() function where user will type a word
and your program should return the meaning of that word.*/
fun main(){
    val word= mapOf(
        "apple" to "a fruit",
        "book" to "a set of written pages",
        "cat" to "a small animal",
        "day" to "a period of 24 hours",
        "eat" to "to consume food"
    )
    println("Enter your word")
    val input : String= readln().lowercase()
    val meaning=word[input]
    if(meaning!=null){
        println("$input means $meaning")
    }
    else{
        println("word not found")
    }
}
package com.example.kotlinpractice

/*
* 문자열을 다루는 법
* */

fun main() {
    val test1 = "Test.Kotlin.String"

    println(test1.length)   //문자열의 길이

    println(test1.toLowerCase()) //문자열 전부 소문자로
    println(test1.toUpperCase()) //문자열 전부 대문자로

    var test2 = test1.split(".")    //문자열 나누기
    println(test2)

    println(test2.joinToString())   //문자열 합치기
    println(test2.joinToString("-")) // "-"를 넣어서 합쳐짐

    println(test1.substring(5..10)) //문자열 일부 추려내기

    //문자열이 비어있는지 여부를 판단하여 boolean 값으로 반환
    //공백 문자 : Space, Tab, LineFeed, Carrige Return, ... 등 눈에 직접적으로 보이지 않는 문자들
    val nullString: String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "A"

    //null이거나 empty이면 true를 반환
    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println()

    //null이거나 blank이면 true를 반환
    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java"))
    println(test4.startsWith("java"))

    println()

    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))

    println()

    println(test3.contains("lin"))
    println(test4.contains("lin"))
}
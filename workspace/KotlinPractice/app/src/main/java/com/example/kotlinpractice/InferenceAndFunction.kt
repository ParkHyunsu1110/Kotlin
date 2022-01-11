package com.example.kotlinpractice

/**
 * 타입추론과 함수
 */

fun main() {

    //타입 추론

    //Int
    var a = 1234
    //Long
    var b = 1234L

    //Double
    var c = 12.45
    //Float
    var d = 12.45f

    //16진수
    var e = 0xABCD
    //2진수
    var f = 0b0101010

    //Boolean
    var g = true
    //Char
    var h = 'c'

    //함수
    println(add1(5, 6, 7))
    println(add2( 1, 2, 3))
}

fun add1(a: Int, b:Int, c: Int): Int { //반환값이 없으면 Int 안써줘도 됨
    return a + b + c
}

//단일 표현식 함수
fun add2(a: Int, b:Int, c: Int) = a + b + c
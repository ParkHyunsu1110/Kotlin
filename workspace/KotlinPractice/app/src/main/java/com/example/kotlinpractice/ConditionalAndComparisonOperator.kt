package com.example.kotlinpractice

/**
 * 조건문과 비교연산자
 */

fun main() {

    //if문
    var a = 11

    if(a > 10){
        println("a는 10보다 크다.")
    } else {
        println("a는 10보다 작거나 같다.")
    }

    //비교 연산자
    // <, <=. >, >=, !=, ==

    //is연산자, !is 연산자: 좌측 변수가 우측 변수에 할당되는지 체크하고, 형변환까지 한번에 시켜줌

    //when 연산자
    doWhen(1)
    doWhen("Dimo")
    doWhen(12L)
    doWhen(3.141592)
    doWhen("Kotlin")
}

fun doWhen(a: Any) {

    /*when(a) {
        1 -> println("정수 1입니다.")
        "Dimo" -> println("디모의 코틀린 강좌입니다.")
        is Long -> println("Long 타입 입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("어떤 조건도 맞지 않습니다.")
    }*/

    var result = when(a) {
        1 -> "정수 1입니다."
        "Dimo" -> "디모의 코틀린 강좌입니다."
        is Long -> "Long 타입 입니다."
        !is String -> "String 타입이 아닙니다."
        else -> "어떤 조건도 맞지 않습니다."
    }

    println(result)
}
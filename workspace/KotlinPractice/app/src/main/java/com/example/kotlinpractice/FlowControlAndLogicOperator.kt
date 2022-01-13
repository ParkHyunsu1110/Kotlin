package com.example.kotlinpractice

/*
* 흐름제어와 논리연산자
* */

fun main() {
    /*for(i in 1..10){
        if( i==3 ) continue //break
        println(i)
    }*/

    //label을 통해 조건문으로 반복문 제어
    stop@for (i in 1..10){ //label의 이름은 직접 결정
        for (j in 1..10) {
            if(i == 1 && j == 2) break@stop
            println("i : $i, j : $j")
        }
    }

    //논리연산자
    println(true && false)
    println(true || false)
    println(!true)
    println(!false)

    var a = 6
    var b = 4

    println(a>5 && b>5)
}
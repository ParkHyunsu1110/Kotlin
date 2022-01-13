package com.example.kotlinpractice

/*
* 반복문과 증감연산자
* */

fun main() {
    var a = 0; var b = 0

    //while문
    while(a < 5) print (a++); println(++b)

    //do-while문
    a=0; do{ println(a++) } while(a < 5)

    //for문
    for(i in 0..9) print(i) //인덱스 변수에는 var 필요 없음
    for(j in 0..9 step 3) print(j)
    for(k in 9 downTo 0) print(k)
    for(h in 'a'..'e') print(h)
}

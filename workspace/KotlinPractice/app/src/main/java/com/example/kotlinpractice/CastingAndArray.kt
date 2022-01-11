package com.example.kotlinpractice

/**
 *  형변환과 배열
 *  !논리형은 변환할 수 없음!
 */

fun main() {

    //형변환
    var a: Int = 54321
    var b: Long = a.toLong() //명시적 형변환: 변환될 자료형을 개발자가 직접 정함
                             //암시적 형변환: 변수를 할당할 시 자료형을 지정하지 않아도 자동으로 형변환 됨

    //배열
    var intArr = arrayOf(1, 2, 3, 4, 5)
    var nullArr = arrayOfNulls<Int>(5) //<자료형>: 제네릭 Generic

    intArr[2] = 8

    println(intArr[4])

}
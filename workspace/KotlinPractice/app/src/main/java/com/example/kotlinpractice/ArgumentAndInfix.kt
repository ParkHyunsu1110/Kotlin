package com.example.kotlinpractice

/*
* 오버라이딩과 argument, infix
* */

// overloading : '같은 Scope 안'에서 같은 이름의 함수를 여러개 만들 수 있는 기능.
// 파라미터의 개수와 자료형에 따라 서로 다른 함수로 동작할 수 있음



fun main() {
    read(7)
    read("감사합니다.")

    //default argument
    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")

    //named argument :패러미터의 순서와 상관 없이 패러미터의 이름을 사용하여 직접 값을 할당하는 기능
    deliveryItem("선물", destination = "친구집")

    //variable number of argumnets : 개수가 지정되지 안호은 패러미터, 맨마지막에 위치 해야 함
    sum(1, 2, 3, 4)

    //infix function : 연산자처럼 쓸 수 있음
    println(6 multiply 4) // this = 6, x = 4
    println(6.multiply(4))

}
fun read(x: Int){ println("숫자 x입니다.") }

fun read(x: String) { println(x) }

fun deliveryItem(name: String, count: Int=1, destination: String = "집"){ println("${name}, ${count}개를 ${destination}에 배달하였습니다.") }

fun sum(vararg numbers: Int){
    var sum = 0

    for(n in numbers) sum += n

    println(sum)
}

infix fun Int.multiply(x: Int): Int = this * x
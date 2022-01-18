package com.example.kotlinpractice

/*
* 고차함수와 람다함수
* */

//고차함수: 함수를 마치 클래스에서 만들어낸 '인스턴스'처럼 취급하는 방법 함수를 파라미터로 넘겨줄 수 있고, 결과값으로 반환받을 수 있는 방법
//람다함수: 일반함수와 달리 그 자체가 고차함수이므로 별도의 연산자 없이 변수에 담을 수 있다.
fun main() {

    b(::a)

    //val c: (String) -> Unit = { str -> println("$str 람다 함수")}
    val c = {str:String -> println("$str 람다함수")}
    b(c)
}

fun a(str: String) {
    println("$str 함수 a")
}

fun b(function: (String) -> Unit) {
    function("b가 호출한")
}
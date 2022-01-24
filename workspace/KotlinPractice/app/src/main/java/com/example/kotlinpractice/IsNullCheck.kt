package com.example.kotlinpractice

/*
* null 값을 처리하는 방법
* */

// ?. -> null safe operator : 참조연산자를 실행하기 전에 객체가 null인지 확인하고, 맞으면 뒤따라오는 구문을 실행하지 않는 연산자
// ?: -> elvis operator : 객체가 null이 아니라면 그대로 사용하지만, null이라면 연산자 우측의 객체로 대체되는 연산자
// !!. -> non-null assertion operator : 참조연산자를 사용할 때 null 여부를 컴파일 시 체크하지 않도록하여 런타임 시 null pointer exception이 나도록 의도

fun main() {

    var a: String? = null

    println(a?.toUpperCase())

    println(a?:"default".toUpperCase())

    //println(a!!.toUpperCase())

    //null safe연산자는 scope 함수와 함께 사용하면 더 편리하다.
    a = "Kotlin Exam"

    a?.run{
        println(toUpperCase())
        println(toLowerCase())
    }

    //변수의 동일성 체크
    //내용의 동일성 : 메모리 상의 서로 다른 곳에 할당된 객체라고 해도 그 내용이 같으면 두개가 같다. a==b
    //객체의 동일성 : 서로 다른 변수가 메모리 상의 같은 객체를 가리키고 있을 때만 동일 객체라 판단 a===b
    var aP = Product("콜라", 1000)
    var bP = Product("콜라", 1000)

    var cP = aP
    var dP = Product("사이다", 1000)

    println(aP == bP)
    println(aP === bP)

    println(aP == cP)
    println(aP === cP)

    println(aP == dP)
    println(aP === dP)

}

class Product(val name: String, val price: Int){
    override fun equals(other: Any?): Boolean {
        if(other is Product){
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}
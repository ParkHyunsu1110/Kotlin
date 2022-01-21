package com.example.kotlinpractice

/*
* 제네릭
* */

// Generic: 함수나 클래스를 선언할 때 고정적인 자료형 대신, 실제 자료형으로 대체 되는 "타입 패러미터"를 받아 사용하는 방법
// 자료형을 대체하게 되어 캐스팅을 방지하기 때문에 성능을 더 높일 수 있다.

fun main() {

    //클래스에서의 제네릭 사용
    //UsingGeneric<A> (A()).doShouting()
    UsingGeneric(A()).doShouting()
    UsingGeneric(B2()).doShouting()
    UsingGeneric(C()).doShouting()

    //함수의 제네릭 사용
    doShouting(B2())
}

//함수의 제네릭 사용
fun <T: A> doShouting(t: T) {
    t.shout()
}

//클래스에서의 제네릭 사용
open class A {
    open fun shout(){
        println("A가 소리칩니다.")
    }
}

class B2 : A() {
    override fun shout() {
        println("B2가 소리칩니다.")
    }
}
class C : A() {
    override fun shout() {
        println("C가 소리칩니다.")
    }
}

class UsingGeneric<T: A> (val t: T) {
    fun doShouting() {
        t.shout()
    }
}
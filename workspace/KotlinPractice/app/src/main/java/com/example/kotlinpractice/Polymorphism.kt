package com.example.kotlinpractice

/*
* 클래스의 다형성
* */

// as : 변수를 호환되는 자료형으로 변환해주는 연산자, 즉시 변환하고, 반환도 해줌
// is : 변수가 자료형에 변환되는 지를 확인하고 캐스팅 해주는 연산자

fun main() {
    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    //b.washDishes() -> 오류: b는 Drink변수이므로 호출이 불가능 하다. => is나 as를 통해 Down-Casting 해야함

    if(b is Cola){
        b.washDishes()
    }

    var c = b as Cola
    c.washDishes()
    b.washDishes()  //as를 사용하면 반환값 뿐만 아니라 변수 자체도 Down-Casting 됨
}

open class Drink {
    var name = "음료"

    open fun drink() {
        println("${name}을 마십니다.")
    }
}

class Cola: Drink() {
    var type = "콜라"
    override fun drink() {
        println("${name}중에 ${type}를 마십니다.")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다.")
    }
}
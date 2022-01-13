package com.example.kotlinpractice

/*
* 클래스의 기본 구조
* */

fun main() {

    var a = Person("박보영", 1990)
    var b = Person("전정국", 1997)
    var c = Person("장원영", 2004)

    //변수명.속성명
    //println("안녕하세요, ${a.birthYear}년생 ${a.name}입니다.")
    a.introduce()
    b.introduce()
    c.introduce()
}

class Person (var name:String, val birthYear: Int) {
    fun introduce() {   //클래스 내부에서는 속성이름만 사용함
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}

//클래스: 인스턴스를 만드는 틀
//인스턴스: 클래스를 통해 만듫어내는 서로 다른 속성의 객체를 지칭하는 용어
package com.example.kotlinpractice

/*
* 클래스의 생성자
* */

//생성자: 새로운 인스턴스를 만들기 위해 호출하는 특수한 함수
//인스턴스 속성 초기화, 구문 실행
//init:파라미터와 반환형이 없음, 생성자를 통해 인스턴스가 만들어질 때 호출되는 함수

fun main() {
    var a = Person2("박보영", 1990)
    var b = Person2("전정국", 1997)
    var c = Person2("장원영", 2004)

    //보조 생성자 사용
    var d = Person2("이루다")
    var e = Person2("차은우")
    var f = Person2("류수정")
}

class Person2 (var name:String, val birthYear:Int) {
    init {
        println("안녕하세요, ${this.birthYear}년생 ${this.name}입니다.")
    }
    //보조 생성자
    constructor(name: String):this(name, 1997){
        println("보조 생성자가 사용되었습니다.")
    }
}

//기본 생성자: 클래스를 만들 때 기본으로 선언

//보조 생성자: 필요에 따라 추가적으로 선언
//기본 생성자와 다른 형태의 생성자를 제공하여 인스턴스 생성시 편의를 제공
//추가적인 구문을 수행하는 기능을 제공하는 역할
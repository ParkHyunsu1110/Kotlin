package com.example.kotlinpractice

/*
* 클래스의 상속
* */

//상속이 필요한 경우:
//이미 존재하는 클래스를 확장하여 새로운 속성이나 함수를 추가한 크래스를 만들어야 할 떄
//여러개의 클래스를 만들었는데 클래스들의 공통점으로 뽑아 관리를 편하게 해야 할 때

fun main() {
    var a = Animal("별이", 5, "개")
    var b = Dog("별이", 5)

    a.introduce()
    b.introduce()

    b.bark()

    var c = Cat("루이", 1)

    c.introduce()
    c.meow()
}

open class Animal (var name:String, var age:Int, var type:String) {  //코틀린은 상속 금지가 기본 값 -> class를 open class로
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

class Dog (name: String, age: Int) : Animal(name, age, "개"){
    fun bark(){
        println("멍멍")
    }
}

class Cat (name:String, age: Int) : Animal (name,age, "고양이"){
    fun meow(){
        println("야옹야옹")
    }
}

//서브클래스는 수퍼 클래스의 함수 이름과 같을 수 없음.
//수퍼클래스의 생성자까지 호춯해야 한다.
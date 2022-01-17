package com.example.kotlinpractice

/*
* 오버라이딩과 추상화
* */

fun main() {

    //오버라이딩: 이미 구현이 끝난 함수의 기능을 서브클래스에서 변경해야 할 때
    var t = Tiger()
    t.eat()

    //추상화: 형식만 선언하고 실제 구현은 서브 클래ㅡ세 일임할 떄 사용하는 기능
    var r = Rabbit()
    r.eat()
    r.sniff()

    //서브클래스: 서로 다른 기능들을 여러개에 물려주어야 할 떄
    var d = Dog2()
    d.run()
    d.eat()
}

//오버라이딩
open class Animal2 {
    open fun eat() {
        println("음식을 먹습니다.")
    }
}

class Tiger : Animal2() {
    override fun eat(){
        println("고기를 먹습니다.")
    }
}

//추상화
abstract class Animal3 {
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class Rabbit : Animal3() {
    override fun eat() {
        println("당근을 먹습니다.")
    }
}

//인터페이스로 구현
interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println ("음식을 먹습니다.")
    }
}

class Dog2 : Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다.")
    }

    override fun eat() {
        println("허겁지겁 먹습니다.")
    }
}

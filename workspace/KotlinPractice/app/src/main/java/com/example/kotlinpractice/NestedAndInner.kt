package com.example.kotlinpractice

/*
* 중첩클래스와 내부클래스
* */

// 중첩클래스 : 하나의 클래스가 다른 클래스의 기능과 강하게 연관되어 있다는 의미를 전달하기 위해 만들어진 형식, 형태만 내부, 공유 불가
// 내부 클래스 : 혼자서 객체를 만들 수 없고, 외부 클래스으ㅔ 객체가 있어야만 생성과 사용이 가능, 외부 클래스의 속상과 함수 사용이 가능
fun main() {

    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()

}

class Outer {
    var text = "Outer Class"

    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"

        fun introduceInner() {
            println(text)
        }

        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}
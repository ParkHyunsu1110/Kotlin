package com.example.kotlinpractice

/*
* Data Class와 Enum Class
* */

// Data Class
// equals() : 내용의 동일성 판단
// hashcode() : 객체의내용에서 고유한 코드를 생성
// toString() : 포함된 속성을 보여줌
// copy() : 객체를 복사하여 새 객체를 만듦 -> 똑같은 객체를 생성하거나, 일부 속성을 변경해 줄수 있음
// componentX() : 속성을 순서대로 반환함

fun main() {

    //일반
    val a = General("보영", 212)

    println(a == General("보영", 212)) //일반
    println(a.hashCode())
    println(a)

    //테스트트
   val b = Data("루다", 306)

    println(b == Data("루다", 306))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("아린"))
    println(b.copy(id = 618))

    //componentX()
    val list = listOf(Data("보영", 212),
                        Data("루다", 306),
                        Data("아린", 618))

    for((a, b) in list){
        println("${a}, ${b}")
    }

    // Enumerated type : 열거형, 일반적으로 대문자로 기술함
    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)
}

class General(val name: String, val id: Int)
data class Data(val name: String, val id: Int)

enum class State(val message: String){
    SING("노래를 부릅니다."),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다.");

    fun isSleeping() = this == State.SLEEP
}
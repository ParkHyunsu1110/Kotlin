package com.example.kotlinpractice

/*
* 컬렉션 함수 1
* */
// 컬렉션 함수 : list, set, map과 같은 컬렉션 또는 배열에 일반 함수 또는 람다 함수 형태를 사용하여 for문 없이 순회하거나 조건을 지칭하는 등의 활동을 함
fun main() {
    val nameList = listOf("박수영", "김지수", "김다현", "신유나", "김지우")

    nameList.forEach{ print(it + " ")} //리스트를 돌면서, 이름 뒤에 공백 추가
    println()

    println(nameList.filter { it.startsWith("김") }) // 리스트에 "김"으로 시작하는 것이 있는지
    println(nameList.map { "이름 : " + it })

    println(nameList.any{ it == "김지연"}) //리스트의 원소 중 하나라도 같은 것이 있는지
    println(nameList.all{it.length == 3}) //리스트의 원소의 길이가 모두 3인지
    println(nameList.none{ it == "이"}) //리스트의 원소 중 "이"로 시작하는 것이 없는지

    println(nameList.first{it.startsWith("김")}) //김으로 시작하는 첫번째
    println(nameList.last{it.startsWith("김")}) // 김으로 시작하는 마지막
    println(nameList.count{it.contains("지")}) //"지"가 몇번 들어가는지
}
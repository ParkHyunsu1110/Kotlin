package com.example.kotlinpractice

/*
* 리스트
* 목록이 필요한 모든 코드에서 가장 편리하게 사용가능한 컬렉션이다.
* */

// List<out T>: 생성시에 넣은 객체를 대체, 추가, 삭제할 수 없음
// MutableList<out T>: 생성시에 넣은 객체를 대체, 추가, 삭제할 수 있음 + 섞기와 정렬 가능
// * Mutable: 변할 수 있는

fun main() {
    val a = listOf("사과", "딸기", "배")
    println(a[1])

    for(fruit in a) {
        print("${fruit}:")
    }

    println()

    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)
}
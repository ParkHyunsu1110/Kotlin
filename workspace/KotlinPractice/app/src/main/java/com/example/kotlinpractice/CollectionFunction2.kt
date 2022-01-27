package com.example.kotlinpractice

/*
* 컬렉션 함수 2
* */

fun main() {
    data class Person(val name: String, val birthYear: Int)

    val personList = listOf(Person("유나", 1992),
                            Person("조이", 1996),
                            Person("츄", 1999),
                            Person("유나", 2003))

    println(personList.associateBy { it.birthYear })    // Key를 추출해 map으로 변환
    println(personList.groupBy { it.name })// Key가 같은 아이템끼리 배열로 묶어 map으로 지정

    val (over98, under98) = personList.partition { it.birthYear > 1998 }// 아이템에 조건을 걸어 두개의 컬렉션으로 나누어 줌
    println(over98)
    println(under98)

    val numbers = listOf(-3, 7, 2, -10, 1)

    println(numbers.flatMap { listOf(it * 10, it + 10) })//아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수

    println(numbers.getOrElse(1){50})//인덱스 위치에 아이템이 있으면 아이템을 반환하고 아닌 경우 지정한 기본값을 반환하는 함수
    println(numbers.getOrElse(10){50})

    val names = listOf("A", "B", "C", "d")

    println(names zip numbers)//컬렉션 두 개의 아이템을 1:1로 매칭하여 새 컬렉션을 만들어줌
}
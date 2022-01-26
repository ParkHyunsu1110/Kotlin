package com.example.kotlinpractice

/*
* Set과 Map
* */



fun main(){

    //Set : 순서가 정렬되지 않으며, 중복이 허용되지 않음, 인덱스 허용 안함. List 처럼 추가, 삭제 여부에 따라 MutableSet 사용
    val a = mutableSetOf("귤", "바나나", "키위")

    for(item in a) println("${item}")

    a.add("자몽"); println(a)
    a.remove("바나나"); println(a)
    println(a.contains("귤"))

    // Map : 객체를 넣을 떄 그 객체를 찿ㅈ아 낼 수 있는 Key를 쌍으로 넣어주는 컬렉션
    // (key, value) 객체의 위치가 아닌 고유의 key를 통해 객체를 참조하는 특징이 있음
    val b = mutableMapOf("레드벨벳" to "음파음파",
                        "트와이스" to "FANCY",
                        "ITZY" to "ICY")

    for(entry in b) {
        println("${entry.key} : ${entry.value}")
    }

    b.put("오마이걸", "번지"); println(b)
    b.remove("ITZY"); println(b)

    println(b["레드벨벳"])
}
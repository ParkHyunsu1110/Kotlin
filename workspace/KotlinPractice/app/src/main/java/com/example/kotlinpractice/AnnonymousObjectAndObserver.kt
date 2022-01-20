package com.example.kotlinpractice

import java.util.*

/*
* 익명객체와 옵저버 패턴
* */

// Observer(= Listener) : 이벤트가 일어나는 것을 감시
// Observer Pattern : 이벤트가 발생할 때마다 즉각적으로 처리할 수 있도록 만드는 프로그래밍 패턴
// 이벤트 : 함수로 직접 요청하지 않았지만, 시스템 또는 루틴에 의해 발생하게 되는 동작들

fun main() {
    EventPrinter().start()
}

interface EventListener {
    fun onEvent(count: Int)
}

class Counter2(var listener: EventListener) {
    fun count() {
        for( i in 1..100) {
            if(i % 5 == 0) listener.onEvent(i)
        }
    }
}

/*class EventPrinter: EventListener {
    override fun onEvent(count: Int) {
        print("${count}-")
    }

    fun start() {
        val counter = Counter2(this)
        counter.count()
    }
}*/

//익명객체
class EventPrinter {
    fun start() {
        val counter = Counter2(object: EventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })

        counter.count()
    }
}
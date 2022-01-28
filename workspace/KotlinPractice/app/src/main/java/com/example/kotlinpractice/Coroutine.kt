package com.example.kotlinpractice

/*
* 코루틴을 통한 비동기 처리
* */

import kotlinx.coroutines.*

fun main() {

    /*runBlocking {   //메인 루틴을 잠시 중단시켜 줌
        val a = launch {    //반환값 없음
            for (i in 1..5) {
                println(i)
                delay(10) //밀리세컨드 단위로 루틴을 잠시 대기시킴
            }
        }

        val b = async { "async 종료" }    //반환값 있음
        println("async 대기")
        println(b.await()) //deferred 실행이 끝날 때 까지 기다려줌

        //println("launch 대기")
        //a.join() //job 실행이 끝날 때까지 기다려줌

        println("launch 취소")
        a.cancel()  //1. 코루틴 내부의 delay() 함수 또는 yield() 함수가 사용된 위치까지 실행하고 종료
                    //2. 속성인 isActive가 false가 되므로 이를 확인하여 수동으로 종료
        println("launch 종료")
    }*/

    runBlocking {
        var result = withTimeoutOrNull(50) {
            for(i in 1..10) {
                println(i)
                delay(10)
            }
            "Finish"
        }
        println(result)
    }


}
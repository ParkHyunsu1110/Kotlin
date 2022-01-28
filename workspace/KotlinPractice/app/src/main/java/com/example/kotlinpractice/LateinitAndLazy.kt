package com.example.kotlinpractice

/*
* 변수의 고급 기술 상수, lateinit, lazy
* */

// var : 힌번 할당 한 객체가 있더라도 변경하여 할당 가능
// val : 한번 객체를 할당하면 다시 변경할 수 없음. 다만, 할당된 객체를 바꿀수 없다 뿐이지, 객체 내부의 속성을 바꿀 수 없는 것은 아님
// const(상수) : 컴파일 시점에 결정되어 절대 바꿀 수 없는 값, 기본 자료형만 가능
// 변수의 경우 런타입시 시간이 더 소모 되기 떄문에 상수를 사용하는 것임.
fun main() {
    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)

    //lateinit : 초기값 할당 전까지 변수 사용 불가. 기본 자료형에는 사용이 불가
    val a = LateInitSample()

    println(a.getLateInitText())
    a.text = "새로 할당한 값"
    println(a.getLateInitText())

    //lazy :변수를 사용하는 시점까지 초기화를 자동으로 늦춰줌. 선언 시 즉시 객체를 생성 및 할당하여 변수를 초기화함.
    val number: Int by lazy {
        println("초기화를 합니다.")
        7   //초기 값
    }

    println("코드를 시작합니다.")
    println(number)
    println(number)
}
class FoodCourt {
    fun searchPrice(foodName: String) {
        val price = when(foodName){
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }

        println("${foodName}의 가격은 ${price}원 입니다.")
    }

    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}

class LateInitSample {
    lateinit var text: String

    fun getLateInitText(): String {
        if(::text.isInitialized) return text    //초기화 여부 물어보기 : :: 변수 . isInitialized
        else return "기본값"
    }
}
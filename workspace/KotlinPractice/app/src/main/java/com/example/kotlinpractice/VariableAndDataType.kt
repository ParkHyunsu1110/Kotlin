package com.example.kotlinpractice

/**
 *  변수와 자료형
 */

fun main() {

    //정수형
    var intValue1: Int = 123 //int
    var intValue2: Int
    intValue2 = 123

    var longValue:Long = 1234L //Long
    var intValueByHex:Int = 0x1af //16진수
    var intValueByBin:Int = 0b10110110 //2진수

    //실수형
    var doubleValue:Double = 123.5 //Double
    var doubleValueWithExp:Double = 123.5e10

    var floatValue:Float = 123.5f

    //문자형 UTF-16 BE
    var charValue:Char = '가'

    //논리형
    var booleanValue:Boolean = true //false

    //문자열
    var stringValue = "one line string test"

    var multiLineStringValue = """multiline
    string
    test"""""

    //null 사용
    var nullValue: Int? = null //null point exception 오류 발생 위험

    println(intValue1)

}
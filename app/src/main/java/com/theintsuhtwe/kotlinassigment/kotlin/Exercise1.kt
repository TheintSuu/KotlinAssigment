package com.theintsuhtwe.kotlinassigment.kotlin

import java.util.*


fun main(args : Array<String>){
    checkPlainDrome()
    balancedParentheses()


    }





 fun checkPlainDrome() {
     var palinDrome = false
     while(!palinDrome){
         val scanner = Scanner(System.`in`)
         print("Enter palinDrome number")
         val input = scanner.next().toString()
         val reverseInput = input.reversed()
         palinDrome = input.equals(reverseInput)
         if( !palinDrome)   print("You fail!, Please try with other text.") else print("The text you entered is Palindrome and you pass the test")

     }
}

fun balancedParentheses(){
    val scanner = Scanner(System.`in`)
    print("Enter type only these characters ' { } [ ] ( ) ' ")

    val input = scanner.next().toCharArray()
    val patternString = listOf<Char>('{','}','(',')','[',']')
    loop@ for (i in input){
        when(i){
            '{','}','(',')','[',']'  ->  {
                check(input)

            }
            else -> {

                println("Fail. Input must be [ or { or (")
                break@loop
            }
        }

    }

}

fun check(input : CharArray) {
    var countStartBracket = 0
    var countEndBracket = 0
    var countStartParenthes = 0
    var countEndParenthes = 0
    var countStart = 0
    var countEnd = 0
    for(i in input){
        when(i){
            '{' -> {
                countStartBracket++
            }
            '}' -> {
                countEndBracket++
            }
            '[' -> {
                countStartParenthes++
            }
            ']' -> {
                countEndParenthes++
            }
            '(' -> {
                countStart++
            }
            ')' -> {
                countEnd++
            }
            else -> {

            }


        }
    }

    if (countStartBracket == countEndBracket && countStartBracket==countEndParenthes && countStart== countEnd){
        print("It's balancedd. pair of {= $countStartBracket, pair of [=$countStartParenthes, pair of ( = $countStart")
    }else{
        print(" It’s not balanced.")
    }

}


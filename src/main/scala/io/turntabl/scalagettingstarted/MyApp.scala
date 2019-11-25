package io.turntabl.scalagettingstarted

object MyApp extends App {
    print("Hello, World!\n")

//    printing were i was born
        val firstName ="Franklin"
        val town ="Kumasi Ashanti"

//    printing it in string interpolation
    print(s"$firstName was born in $town\n")

//    printing three times a word
    for (threeTimes <- 1 to 3) print("hello")

//    even
def even_?(num: Int) = num%2 ==0
    even_?(5)
//    or

def even(num1: Int) =if (num1%2 ==0) true else false
    even(3)


//    odd
//def odd_?(num2: Int) = num2%2 ==0
//    odd_?(5)

    def wordsToLowerCase(words: String*) = words map (_.toLowerCase)
    wordsToLowerCase("A","G")

    def even_?(num: Int) = num%2 ==0
    even_?(5)
}

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
    println()

//    even
def even_?(num: Int) = num%2 ==0
    even_?(5)
//    or

def even(num1: Int) =if (num1%2 ==0) true else false
    even(3)

    //odd
//    def odd(x: Int)=!even(x)


    def wordsToLowerCase(words: String*) = words map (_.toLowerCase)
    wordsToLowerCase("A","G")

    def even2_?(num4: Int) = num4%2 ==0
    even2_?(5)

//    weekends
def isWeekendDays(day: String) = day match{
    case "saturday" | "sunday" => true
    case _ => false
}
//    9
    def areWeekends(days: String*) = days map(d=>isWeekendDays(d))

//    foreach
    areWeekends("monday", "saturday") foreach(println)

//11
    def stringNum(word: String, number: Int) = word * number
    print(stringNum("Come", 5))
}

fun main() {
    enterAge(12)
    enterAge(56)
    enterAge(18)
    enterAge(71)

    printNumbers()

    numbers(23)
    numbers(6)
    numbers(101)

    enterPassword("password123")
    enterPassword("Password123")

    factorials(7)
    numbs(9)

    fibonacci()

    exitLoop()

    alphabets('u')
    alphabets('z')

    daysOfWeek("Monday")
    daysOfWeek("Thursday")
    daysOfWeek("Sarturday")










}
//Write a program in Kotlin that asks the user to enter their age and prints a message based on their age. If the age is less than 18, print "You are not old enough to vote". If the age is between 18 and 65, print "You are eligible to vote". If the age is greater than 65, print "You are a senior citizen".
fun enterAge(age:Int){
    if (age < 18){
        println("You are not old enough to vote")
    }
    else if(age in 18..65){
        println("You are eligible to vote")

    }
    else (println("You are a senior citizen"))
}
//Write a program in Kotlin that prints the numbers from 1 to 10 using a for loop.
fun printNumbers(){
    var num = 1..10
    for (n in num){
        println(n)
    }

}
//Write a program in Kotlin that asks the user to enter a number and prints whether it is even or odd.
fun numbers(numb:Int){
    if (numb%2 == 0){
        println("Even number")
    }
    else(println("Odd number"))

}
//Write a program in Kotlin that asks the user to enter a password. If the password is "password123", print "Access granted". If the password is incorrect, print "Access denied".

fun enterPassword(password:String){
    if (password == "password123"){
        println("Access granted")
    }
    else(println("Access denied"))
}
//Write a program in Kotlin that asks the user to enter a number and then prints the factorial of that number. Use a while loop to calculate the factorial.
fun factorials(num:Int){
    var x = 1
    var factorial:Long = 1
    while (x <= num){
        factorial*=x
        x++
    }
    println("the factorial of $num is $factorial")
}
fun numbs (x:Int){
    var n = 1
    var factorial:Long = 1
    while (n<= x){
        factorial*=n
        n++
    }
    println("$factorial")

}
//Write a program in Kotlin that prints the Fibonacci sequence up to a certain number. Use a do-while loop to generate the sequence
//fibonacci sequence is one which a number is the sum of the preceding two
fun fibonacci(){
    val maxNum =50
    var num1:Long = 0
   var num2:Long = 1
    var sum:Long
   do{
       println("$num1")
       sum = num1 + num2
       num1 = num2
       num2 = sum

   }
       while (num1 <= maxNum)
}
//Write a program in Kotlin that uses a break statement to exit a loop when a certain condition is met.

fun exitLoop(){
    var y = 0
    while (y++ < 50){
        println(y)
        if (y ==7){
            break
        }
    }

}
//Write a program in Kotlin that asks the user to enter a letter and then prints whether it is a vowel or a consonant.
fun alphabets(x:Char){
    if (x == 'a' || x=='e' || x=='i' ||x=='0' ||x=='u'){
        println("It is a vowel")
    }
    else println("It is a constant")
}
//Write a program in Kotlin that uses a when statement to print a message based on the day of the week. If it is Monday, print "Monday blues". If it is Friday, print "TGIF!". For any other day, print "Just another day".
fun daysOfWeek(day:String){
    when (day){
        "Monday" -> println("Monday blues")
        "Friday" -> println("TGIF")
         "Tuesday" -> println("Just another day")
        "Wednesday" -> println("Just another day")
        "Thursday" -> println("Just another day")
        "Saturday"-> println("Just another day")
        "Sunday" -> println("Just another day")
        else -> println("N/A")
    }
}
















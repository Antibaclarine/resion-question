fun main() {
var add=integers(12,5)
    println(add)
    println(largest(mutableListOf(23,45,1,20,30,70)))
    println( reversed("Clarine"))
    println( containing(mutableListOf("Apple","clarine","nurse","ann")))
    println(evenNumber(mutableListOf(1,2,3,4,5,6,7,89,)))
    println(sameLetter("madam"))
   println (squares(mutableListOf(2,3,4,5,5,6)))
    println(allCharacter(mutableListOf("Mary","Clarine","Mercy","Margaret")))
}
//Write a function that takes in two integers and returns their sum.
fun integers(num1:Int,num2:Int):Int{
    var number=num1+num2
    return number
}
//Write a function that takes in a list of integers and returns the largest integer in the list.
fun largest(num:List<Int>):Int{
    var largest=Int.MIN_VALUE
    for (n in num){
        if (n >largest){
            largest=n
        }
    }
    return largest
}
//Write a function that takes in a string and returns the string reversed.

fun reversed(name:String):String{
    return name.reversed()
}
//Write a function that takes in a list of strings and returns a new list containing only the strings that start with the letter "a".
fun containing(str:List<String>):List<String>{
    return str.filter { it.startsWith('a') || it.startsWith('A') }
}


//Write a function that takes in a list of integers and returns a new list containing only the even integers.
fun evenNumber(num: List<Int>):List<Int>{
    val evenNums= mutableListOf<Int>()
    for (n in num)
        if (n%2==0){
          evenNums.add(n)
        }
    return evenNums
}
//Write a function that takes in a string and checks if it is a palindrome (i.e. reads the same forwards and backward).
fun sameLetter(letter:String):Boolean {
    var len = letter.length
    for (n in 0 until len / 2)
        if (letter[n] != letter[len - n - 1]) {
            return false
        }
return true
}
//Write a function that takes in a list of integers and returns the sum of the squares of those integers.
fun squares(num:List<Int>):Int{
    var sum=0
    for (num in num){
        sum +=num * num
    }
    return sum
}
//Write a function that takes in a list of strings and returns a new list containing only the strings that have a length greater than 5.
fun characters(word:List<String>):List<String>{

    for (words in word){
        if (words.length>5){

        }
    }
return word
}

fun allCharacter(word: List<String>):List<String>{
    return word.filter { it.length >5 }
}
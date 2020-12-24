// BASICS OF KOTLIN LANGUAGE

// WRITING A HELLO WORLD PROGRAM

/*fun main()
{
    println("hello world")
}
*/

// DECLARING VARIABLES AND CONSTANTS

/*fun main()
{
    // Declaring Variables
    var name: String = "Abhishek"
    println(name)
            //OR
    var lName = "Pathak"
    println(lName)

    // Declaring Constants
    val num: Int = 98
    println(num)
            //OR
    val fNum = 69
    println(fNum)
}
*/

// STRING FORMATTING

/*fun main()
{
    val fName = "Abhishek"
    val lName = "Pathak"

    println("Hello ${fName} ${lName}")
}
*/

// CONDITIONAL STATEMENTS

/*fun main()
{
    val name = "Abhishek"
    if (name == "Abhishek")
    {
        println("Hello $name")
    }
    else
    {
        println("Hii $name")
    }
}
*/

// LOOPS

// for loop and range function
/*fun main()
{
    for (i in 1..10)
    {
        print(" $i")
    }
}
*/

// LISTS

/*fun main()
{
    // creating a unmutable list
    val lst = listOf(1,2,3,4,5,6,7,8,9,"Abhishek","Anirudh","Achint","Akshat")
    // creating a mutable list
    val mlst = mutableListOf(1,2,3,4,5,6,7,8,9,"Abhishek","Anirudh","Achint")

    // accessing list elements through indexing
    //println(lst[5])
    //println(mlst[8])
            //OR
    //println(lst.get(2))
    //println(mlst.get(11))

    // printing all list elements
    //println(lst)
    //println(mlst)

    // adding elements in mutable list
    //mlst.add("Akshat")
    //println(mlst)

    // adding elements at a particular index
    //mlst.add(1,"Pathak")
    //println(mlst)

    // appending elements in a list
    // Note: this will replace current element at the given index
    //mlst[0] = 0
    //println(mlst)

    // getting size/length/no. of elements of the list
    //println(lst.size)
    //println(mlst.size)

    // There are some more list methods in kotlin which we will discuss later when we use it
}
*/

// WHEN STATEMENT

/*fun main()
{
    val lst = mutableListOf("Abhishek","Anirudh","Achint","Akshat","Pashu Mafia")
    for (name in lst)
    {
        when (name)
        {
            "Abhishek" -> {println("Hello Pamthak")}
            "Anirudh"  -> {println("Hello Ansa")}
            "Achint"   -> {println("Hello Muksaa")}
            "Akshat"   -> {println("Hello PB")}
            else       -> {println("Kon hai be tu... $name")}
        }
    }
}
*/

// ARRAYS

/*
fun main()

{
    val arr = arrayOf(1,2,3,4,5,6,7,8,9,"Abhishek")
    // accessing array elements through indexing
    //println(arr[9])

    // accessing each element of array using for loop
    /*for (i in arr)
    {
        print(" $i")
    }

     */
                    //OR

    // accessing each element of array using for each
    /*
    arr.forEach()
    {
        print(" $it")
    }

     */

    // size, get, add and some other function in arrays can be implemented same as shown in lists above
}
 */

//Using map in Kotlin..
fun main()
{
    //Using mapOf (it has the same limitation like listOf) to add values in map it uses mutableMapOf
    var map = mapOf(1 to "Abhishek", 2 to "Anirudh", 3 to "Achint", 4 to "Akshat", 5 to "Pashu Mafia")

    //We can use map[] to get the value in the map according to its index map[index]
    //We can use map.get(index) to get the value in the map but map[] is considered the best practise.
    println(map[1])
    println(map.get(2))

    /*
    //It is used to print the values with their keys
    for (niggers in map){
        println(niggers)
    }
     */


}

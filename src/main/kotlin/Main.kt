fun main(args: Array<String>) {
    val ar = arrayOf<Long>(1000000001 ,1000000002 ,1000000003 ,1000000004 ,1000000005)
    val result = aVeryBigSum(ar)
    println(result)
}

fun aVeryBigSum(ar: Array<Long>): Long {

    var value :Long= 0

    for (arValue in ar ){
        value+=arValue
    }

    return value
}
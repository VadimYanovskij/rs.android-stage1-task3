package subtask4

import kotlin.math.sqrt

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {

    //    throw NotImplementedError("Not implemented")

        var first=number-1
        var squares = mutableListOf<Int>()
        var result: MutableList<Int>
        squares.add(first)
        var n = (number * number) - (first * first)

//        var second = sqrt(n.toDouble()).toInt()-1
//        var n2 = n - (second * second)
//        var squares2 = mutableListOf<Int>()
//        squares2.add(first)
//        squares2.add(second)

//        var squares = mutableListOf<Int>()
        while (n > 0) {
            val square = sqrt(n.toDouble()).toInt()
            squares.add(square)
            n -= square * square
        }

//        while (n2 > 0) {
//            val square = sqrt(n2.toDouble()).toInt()
//            squares2.add(square)
//            n2 -= square * square
//        }

//        if (squares.sum()>squares2.sum())
//            result = squares
//        else
//            result = squares2



//        if (squares.sum()>result.sum()) {
//            result.addAll(findSquares(n))
//        } else {
//            first = sqrt(n.toDouble()).toInt()-1
//            result.add(first)
//          var  n2 = n - (first * first)
//            result.addAll(findSquares(n2))
//        }



        squares.sort()
        return squares.toTypedArray()


    }

//    fun findSquares (n: Int): MutableList<Int> {
//        var nn = n
//        var squares = mutableListOf<Int>()
//        while (nn > 0) {
//            val square = sqrt(n.toDouble()).toInt()
//            squares.add(square)
//             nn -= square * square
//        }
//        return squares
//    }

}

package subtask4

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {

        //    throw NotImplementedError("Not implemented")

        val first = number - 1
        val firstSquare = number * number
        return findNext(firstSquare, first)
    }

    private fun findNext(squareNumber: Int, first: Int): Array<Int>? {
        for (i in first downTo 1) {
            val squareI = i * i
            val nextSquare = squareNumber - squareI
            if (nextSquare < 0) return null
            else if (nextSquare == 0) {
                return arrayOf(i)
            } else {
                var sqrt = kotlin.math.sqrt(nextSquare.toDouble()).toInt()
                if (sqrt >= i) {
                    sqrt = i - 1
                }
                val fNext = findNext(nextSquare, sqrt)
                if (fNext != null) return fNext + arrayOf(i)
            }
        }
        return null
    }
}

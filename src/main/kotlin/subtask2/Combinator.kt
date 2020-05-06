package subtask2

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
   //     throw NotImplementedError("Not implemented")

        for (i in 1..array[1] ){
            if (binomK(array[1], i)==array[0]) return i
        }
        return null
    }

    private fun binomK (n:Int, x:Int):Int {
        if ((n == x) || (x == 0))
            return 1;
        else
            return binomK(n - 1, x) + binomK(n - 1, x - 1);
    }
}

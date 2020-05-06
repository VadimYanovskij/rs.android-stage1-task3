package subtask3

import java.util.*
import kotlin.math.abs


class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
    //    throw NotImplementedError("Not implemented")

        val result: Int
        var prod: Int = 1
        val filtered = mutableListOf<Int>()
        val prodOfNeighbour = mutableListOf<Int>()
        var isAllNegative = false

        for (i in itemsFromArray.indices)
            if (itemsFromArray[i] is Int) filtered.add(itemsFromArray[i] as Int)

        when {
            filtered.size == 0 -> {
                result = 0
            }
            filtered.size < numberOfItems -> {
                for (item in filtered) prod *= item
                result = prod
            }
            else -> {
                filtered.sortDescending()
                if (filtered[0]<0) isAllNegative = true

                if(numberOfItems % 2 == 1){
                    prod = filtered[0]
                    filtered.removeAt(0)
                }

                for(i in filtered.indices){
                    if((i+1 < filtered.size) && (filtered[i] * filtered[i+1] > 0))
                        prodOfNeighbour.add(filtered[i] * filtered[i+1])
                }

                if ((isAllNegative) && (numberOfItems % 2 == 1)) prodOfNeighbour.sort()
                else prodOfNeighbour.sortDescending()

                for(i in 1..numberOfItems/2)
                    prod *= prodOfNeighbour[i-1]
                result = prod
            }
        }
        return result
    }
}

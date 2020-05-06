package subtask5

import kotlin.reflect.KClass

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        //   throw NotImplementedError("Not implemented")

        if (number.contains('-')) return null

        var result = mutableListOf<String>()
        var numberCh = number.toCharArray()
        for (i in numberCh.indices)
            when (numberCh[i]) {
                '1' -> {
                    result.add(changeDigit(numberCh, i, '2'))
                    result.add(changeDigit(numberCh, i, '4'))
                }
                '2' -> {
                    result.add(changeDigit(numberCh, i, '1'))
                    result.add(changeDigit(numberCh, i, '3'))
                    result.add(changeDigit(numberCh, i, '5'))
                }
                '3' -> {
                    result.add(changeDigit(numberCh, i, '2'))
                    result.add(changeDigit(numberCh, i, '6'))
                }
                '4' -> {
                    result.add(changeDigit(numberCh, i, '1'))
                    result.add(changeDigit(numberCh, i, '7'))
                    result.add(changeDigit(numberCh, i, '5'))
                }
                '5' -> {
                    result.add(changeDigit(numberCh, i, '2'))
                    result.add(changeDigit(numberCh, i, '4'))
                    result.add(changeDigit(numberCh, i, '6'))
                    result.add(changeDigit(numberCh, i, '8'))
                }
                '6' -> {
                    result.add(changeDigit(numberCh, i, '3'))
                    result.add(changeDigit(numberCh, i, '5'))
                    result.add(changeDigit(numberCh, i, '9'))
                }
                '7' -> {
                    result.add(changeDigit(numberCh, i, '4'))
                    result.add(changeDigit(numberCh, i, '8'))
                }
                '8' -> {
                    result.add(changeDigit(numberCh, i, '5'))
                    result.add(changeDigit(numberCh, i, '7'))
                    result.add(changeDigit(numberCh, i, '9'))
                    result.add(changeDigit(numberCh, i, '0'))
                }
                '9' -> {
                    result.add(changeDigit(numberCh, i, '6'))
                    result.add(changeDigit(numberCh, i, '8'))
                }
                else -> result.add(changeDigit(numberCh, i, '8'))

            }
        return result.toTypedArray()
    }

    private fun changeDigit(numberCh: CharArray, i: Int, number: Char) : String {
        val temp = numberCh.clone()
        temp[i] = number
        return String(temp)
    }
}
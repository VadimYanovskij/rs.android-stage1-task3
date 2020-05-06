package subtask1

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        //  throw NotImplementedError("Not implemented")
        var result=""
        return if (numbers.isNotEmpty()) {
            for (i in numbers.indices) {
                if (i==0) result = "${numbers[i].toString()}x^${numbers.size-1}"
                else if (i==numbers.size-2 && numbers[i]==-1 ) result = "$result - x"
                else if (i==numbers.size-2 && numbers[i]==1 ) result = "$result + x"
                else if (i==numbers.size-2 && numbers[i]>0) result = "$result + ${numbers[i].toString()}x"
                else if (i==numbers.size-2 && numbers[i]<0) result = "$result - ${(-1*numbers[i]).toString()}x"
                else if (i==numbers.size-1) result = "$result + ${numbers[i].toString()}"
                else if (numbers[i]>0) result = "$result + ${numbers[i].toString()}x^${numbers.size-i-1}"
                else if (numbers[i]<0) result = "$result - ${(-1*numbers[i]).toString()}x^${numbers.size-i-1}"
            }
            result
        } else null
    }
}

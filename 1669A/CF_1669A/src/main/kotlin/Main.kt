class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = IntArray(2)
        var max = 0;
        var idx = 0;

        for (i in array.indices) {
            if (array[i] > max) {
                max = array[i]
                idx = i
            }
        }

        answer[0] = max
        answer[1] = idx

        return answer
    }
}
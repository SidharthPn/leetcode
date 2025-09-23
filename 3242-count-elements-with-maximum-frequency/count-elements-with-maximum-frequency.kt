class Solution {
    fun maxFrequencyElements(nums: IntArray): Int {
        val freqMap = mutableMapOf<Int, Int>()

        // Build frequency map
        for (num in nums) {
            freqMap[num] = freqMap.getOrDefault(num, 0) + 1
        }

        // Find maximum frequency
        val maxFreq = freqMap.values.maxOrNull() ?: 0

        var result = 0
        // Count total elements with maximum frequency
        for (count in freqMap.values) {
            if (count == maxFreq) {
                result += count
            }
        }
        return result
    }
}
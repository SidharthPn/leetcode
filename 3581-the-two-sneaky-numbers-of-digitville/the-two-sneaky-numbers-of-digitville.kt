class Solution {
    fun getSneakyNumbers(nums: IntArray): IntArray {
        val seen = mutableSetOf<Int>()
        val duplicate = mutableListOf<Int>()

        for(num in nums){
            if(num in seen){
                duplicate.add(num)
            }else seen.add(num)
        }
     return duplicate.toIntArray()
    }
}
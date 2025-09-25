class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val unique = nums.distinct()
        for(i in unique.indices){
            nums[i] = unique[i]
        }
        return unique.size
    }
}
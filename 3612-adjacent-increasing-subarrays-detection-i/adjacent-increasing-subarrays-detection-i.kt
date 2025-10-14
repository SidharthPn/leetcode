class Solution {
    fun hasIncreasingSubarrays(nums: List<Int>, k: Int): Boolean {
        val n = nums.size
        if(2*k > n)return false
        fun isIncreasing(start : Int):Boolean{
            for(i in start until start+ k-1){
            if(nums[i]>=nums[i+1])
            return false
        }
        return true
        }

        for(a in 0..n - 2*k){
        if (isIncreasing(a) && isIncreasing(a + k)) {
    return true
          }
        }
     return false
            }
}
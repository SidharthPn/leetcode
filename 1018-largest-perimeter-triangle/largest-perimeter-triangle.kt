class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        nums.sortDescending()
       for(i in 0 until nums.size -2){
        if(nums[i+1] + nums[i+2] > nums[i]){
            return nums[i]+nums[i+1]+nums[i+2]
        }
       } 
       return 0
    }
}
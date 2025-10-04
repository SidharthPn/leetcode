class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        
        var windowSum = 0.0

        for(i in 0 until k ){
            windowSum += nums[i]
        }
        var maxSum = windowSum
        for(i in k until nums.size){
           windowSum += nums[i]-nums[i-k] 

           maxSum = maxOf(maxSum,windowSum)
        }
      return maxSum/k
    }
}
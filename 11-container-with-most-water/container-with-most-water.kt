class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxArea = 0
        while(left < right){
            val width = right - left 
            val minHieght = minOf(height[left],height[right])
            val area = width * minHieght
            maxArea = maxOf(maxArea,area)

            if(height[left]<height[right]){
                left++
            }else {
                right--
            }
        }
        return maxArea
    }
}
class Solution {
    fun minCost(colors: String, neededTime: IntArray): Int {
       var totalTime = 0 
       for(i in 1 until colors.length){
        if(colors[i] == colors[i-1]){
            totalTime += minOf(neededTime[i],neededTime[i-1])
            neededTime[i] = maxOf(neededTime[i] ,neededTime[i-1])     
        }
       }
       return totalTime 
    }
}
class Solution {
    fun largestGoodInteger(num: String): String {
        
        var ans = ""
        for(i in 0 until num.length-2){
            val sub = num.substring(i,i+3)
            if(sub[0] == sub[1] && sub[1] == sub[2] ){
                if(sub > ans) ans = sub
            }
        }
        return ans
    }
}
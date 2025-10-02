class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
       var maxLength = 0 

       for (i in s.indices){
        val seen = mutableSetOf<Char>()
        var length = 0 

        for(j in i until s.length){
            val c = s[j]
            if(c in seen) break 
            seen.add(c)
            length++
        }
        if(length > maxLength) maxLength = length    
        
           }
        return maxLength
    }
   
}
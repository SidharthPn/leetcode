class Solution {
    fun countSubstrings(s: String): Int {
        
        var count = 0 

        fun expandAroundCenter(left : Int ,right : Int){

            var l = left 
            var r = right

        while( l>=0 && r<s.length && s[l]==s[r]){
            count++
            l--
            r++
        }
        }
        for(i in s.indices){
            expandAroundCenter(i,i)
             expandAroundCenter(i,i+1)
        }
        return count 
    }
}
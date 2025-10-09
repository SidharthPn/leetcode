class Solution {
    fun longestPalindrome(s: String): Int {
        val freq = mutableMapOf<Char,Int>()
        for(c in s){
        freq[c] = freq.getOrDefault(c,0)+1
        }
        var length = 0
        var hasOdd = false

        for(count in freq.values){
            length +=(count/2)*2
            if(count%2 == 1) hasOdd = true

        }
        if (hasOdd) length += 1

    return length
    }
}
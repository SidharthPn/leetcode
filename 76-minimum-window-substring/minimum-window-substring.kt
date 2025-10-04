class Solution {
    fun minWindow(s: String, t: String): String {
        if(s.isEmpty()||t.isEmpty())return ""
        val dictT = mutableMapOf<Char , Int>()
        for(c in t){
            dictT[c]=dictT.getOrDefault(c,0)+1
        }
        val required = dictT.size
        var formed = 0

        val windowCounts = mutableMapOf<Char,Int>()

        var left = 0
        var right = 0

        var minLen = Int.MAX_VALUE
        var minLeft = 0 
        while(right<s.length){
            val c = s[right]
            windowCounts[c]=windowCounts.getOrDefault(c,0)+1
            if (dictT.containsKey(c) && windowCounts[c] == dictT[c]) {
            formed += 1
        }
           // Try to shrink window from left while it is valid
        while (left <= right && formed == required) {
            val windowLen = right - left + 1
            if (windowLen < minLen) {
                minLen = windowLen
                minLeft = left
            }

            val leftChar = s[left]
            windowCounts[leftChar] = windowCounts[leftChar]!! - 1
            if (dictT.containsKey(leftChar) && windowCounts[leftChar]!! < dictT[leftChar]!!) {
                formed -= 1
            }
            left += 1
        }

        // Expand window
        right += 1
    }

    return if (minLen == Int.MAX_VALUE) "" else s.substring(minLeft, minLeft + minLen)
}
}
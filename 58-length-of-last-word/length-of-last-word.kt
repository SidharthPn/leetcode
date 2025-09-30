class Solution {
    fun lengthOfLastWord(s: String): Int {
        
        val trimm = s.trim()

        val word = trimm.split(" ")

        val lastword = word.last()
        
        return lastword.length
    }
}
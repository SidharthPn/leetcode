class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>() 
         for (ch in s) {
            when (ch) {
                '(', '{', '[' -> stack.add(ch) 

                ')' -> if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '(') return false
                '}' -> if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '{') return false
                ']' -> if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '[') return false
            }
              }

        return stack.isEmpty()
    }
}
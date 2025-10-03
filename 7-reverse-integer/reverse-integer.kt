class Solution {
    fun reverse(x: Int): Int {

      var num = x
      var rev = 0 
       
       while(num != 0){
       val digit = num%10
       num /= 10

       if( rev > Int.MAX_VALUE /10 || rev < Int.MIN_VALUE/10 ){
        return 0
       }
       rev  = rev*10+digit
       }
        return rev
    }
}
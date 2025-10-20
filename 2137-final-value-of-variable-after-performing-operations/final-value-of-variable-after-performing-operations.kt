class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0
        for(op in operations){
            if(op.contains("++")){
                x++
            }else{
                x--
            }
        }
            return x

    }
}
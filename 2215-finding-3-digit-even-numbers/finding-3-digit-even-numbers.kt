class Solution {
    fun findEvenNumbers(digits: IntArray): IntArray {
        val res = mutableSetOf<Int>()
        val n = digits.size

        for (i in 0 until n){
            for(j in 0 until n){
                for(k in 0 until n){
                    if(i!=j && j!=k && k!= i){
                        val a = digits[i]
                        val b = digits[j]
                        val c = digits[k]

                        if(a==0)continue

                        if(c%2 != 0)continue

                        val num = a*100 + b*10 + c
                        res.add(num)
                    }
                }
            }
        }
            return res.sorted().toIntArray()

    }
}
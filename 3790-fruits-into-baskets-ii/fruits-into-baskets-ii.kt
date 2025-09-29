class Solution {
    fun numOfUnplacedFruits(fruits: IntArray, baskets: IntArray): Int {
    val used = BooleanArray(baskets.size) { false }
       var unplaced = 0

      for(fruit in fruits){
        var placed = false
        for(i in baskets.indices){
            if(!used[i]&& baskets[i]>=fruit){
                used[i]= true
                placed = true
                break
            }
        }
        if(!placed){
            unplaced++
        }
      }
      return unplaced 
    }
}
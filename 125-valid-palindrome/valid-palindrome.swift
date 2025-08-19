class Solution {
    func isPalindrome(_ s: String) -> Bool {
        let chars = Array(s)  // convert string to array for index access
        var i = 0
        var j = chars.count - 1

        while i < j {
            if !chars[i].isLetter && !chars[i].isNumber {
                i += 1
            } else if !chars[j].isLetter && !chars[j].isNumber {
                j -= 1
            } else if chars[i].lowercased() != chars[j].lowercased() {
                return false
            } else {
                i += 1
                j -= 1
            }
        }
        return true
    }
}

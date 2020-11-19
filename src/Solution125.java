/**
 * 125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 * 通过次数170,171提交次数365,936
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        // 高层次(主干)逻辑
        // 1. filter out number & char; 2. reverse and compare
        String filteredS = _filterNonNumberAndChar(s);
        return  _reverseString(filteredS).equalsIgnoreCase(filteredS);
    }

    private String _reverseString(String filteredS) {
        return new StringBuilder(filteredS).reverse().toString();
    }

    private String _filterNonNumberAndChar(String s) {

        return s.replaceAll("[^A-Za-z0-9]", "");
    }
}

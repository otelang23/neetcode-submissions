class Solution {
    public boolean isPalindrome(String s) {
       int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char char1 = s.charAt(i);
            char char2 = s.charAt(j);

            if (!Character.isLetterOrDigit(char1)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(char2)) {
                j--;
                continue;
            }

            if (char1 >= 'A' && char1 <= 'Z') char1 |= 32;
            if (char2 >= 'A' && char2 <= 'Z') char2 |= 32;

            if (char1 != char2) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}

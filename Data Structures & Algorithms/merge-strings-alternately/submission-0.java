class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int len1 = word1.length();
        int len2 = word2.length();

        // Loop until we have processed all characters from both strings
        while (i < len1 || i < len2) {
            // Append from word1 if characters remain
            if (i < len1) {
                sb.append(word1.charAt(i));
            }
            // Append from word2 if characters remain
            if (i < len2) {
                sb.append(word2.charAt(i));
            }
            i++;
        }

        return sb.toString();
    }
}
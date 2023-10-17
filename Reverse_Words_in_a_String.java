public class Solution {
    public String reverseWords(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j && s.charAt(i) == ' ') i++;   // Find the first non-space character
        while (j >= i && s.charAt(j) == ' ') j--;   // Find the last non-space character
        s = s.substring(i, j + 1);                  // Extract the trimmed substring
        String[] words = s.split("\\s+");           // Tokenize the string into words
        StringBuilder out = new StringBuilder();
        for (int k = words.length - 1; k > 0; k--) {
            out.append(words[k]).append(" ");
        }
        return out.append(words[0]).toString();       // Concatenate the reversed words
    }
}

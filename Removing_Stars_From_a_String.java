class Solution {
    public String removeStars(String s) {

        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '*')
                stack.remove(stack.size() - 1);
            else
                stack.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (char subArray : stack) {
            sb.append(subArray);
        }
        return sb.toString();
    }
}
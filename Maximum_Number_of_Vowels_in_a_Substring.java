class Solution {
    public int maxVowels(String s, int k) {
        int i = 1;
        int j = k;
        int max = 0;
        int count = 0;
        HashSet<Character> hs = new HashSet<>();

        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');

        for(int l = 0; l < k; l++)
            if(hs.contains(s.charAt(l)))
                count++;

        max = count;

        while(j < s.length()){
            if(hs.contains(s.charAt(i-1)))
                count--;
            if(hs.contains(s.charAt(j)))
                count++;
            
            i++;
            j++;
            max = Math.max(count, max);
        }

        return max;
    }
}
// UP-VOTE IF HELPFUL
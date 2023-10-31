class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new LinkedList<>();
        // sorting
        Arrays.sort(products);

        for (int i = 0; i < searchWord.length(); i++) result.add(new LinkedList<>());
        int index = 0;
        int count = 0;

        while (index < products.length) {
            if (count == searchWord.length()*3) break;
            // find min length 
            int len = Math.min(searchWord.length(),products[index].length());
             for (int i = 0; i < len; i++) {
                if (products[index].charAt(i) == searchWord.charAt(i)) {
                    List<String> list = result.get(i);
                    // check limit
                    if (list.size() < 3) {
                        list.add(products[index]);
                        count++;
                    }
                } else break;
            }
            index++;
        }
        
        return result;
    }
}
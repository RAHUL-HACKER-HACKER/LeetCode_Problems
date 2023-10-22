class Solution {
    String [] alpha={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz","0"};
    List<String> list=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return list;
        StringBuilder builder=new StringBuilder();
        bt(digits,0,builder);
        return list;
    }
    public void bt(String n,int i,StringBuilder builder){
        if(i>=n.length()){
            list.add(builder.toString());
            return;
        }
        int m=Integer.parseInt(""+n.charAt(i));
        for(int j=0;j<alpha[m-1].length();j++){
            bt(n,i+1,builder.append(alpha[m-1].charAt(j)));
            builder.deleteCharAt(builder.length()-1);
        }
    }
}
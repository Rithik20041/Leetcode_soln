class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        String st=new StringBuilder(s).reverse().toString();
        return st.equals(s);
    }
}
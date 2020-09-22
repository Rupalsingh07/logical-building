public class Solution10 {

    public static void main(String args[]) {
        String s="AMAR SINGH";
        char ch[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
             ch[i]=s.charAt(i);
             if(i>2){
                 System.out.print(ch[i]);
             }

        }

    }
}
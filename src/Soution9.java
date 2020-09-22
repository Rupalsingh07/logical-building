import java.util.Scanner;

public class Soution9 {
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.println("enter the string");
        String s = n.nextLine();
        String p=new String();
         char ch[]=new char[s.length()];
         for(int i=s.length();i>0;i--)
        {
             ch[i]=s.charAt(i);
        }

         p=String.valueOf(ch);
         if(p.equals(s)){
             System.out.println("it is a palindrome");
         }
         else{
             System.out.println("it is not a palindrome");
         }



        }
}

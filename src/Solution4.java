import java.util.Scanner;

public class Solution4 {
    public static void main(String args[]){
        int  count=0;
        Scanner n = new Scanner(System.in);
        System.out.println("enter the string");
        String s = n.nextLine();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='o'||ch[i]=='u'||ch[i]=='i'||ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='U'||ch[i]=='I'){
              count+=1;
            }
        }

   System.out.println(count);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Solution18 {


    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);
        System.out.println("enter the string");
        int count = 0;
        String s1 = n.nextLine();
        char ch[] = new char[s1.length()];
          Arrays.sort(ch);
          for(int i=0;i<ch.length;){

        if(i<ch.length-1 &&((Character.compare(ch[i],ch[i+1])==0))) {
            count += 1;
            i++;
        }
        else{
            System.out.println(ch[i]+"-"+(count+1));
            count=0;
             i++;


            }
        }
    }
}

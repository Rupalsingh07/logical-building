import java.util.Scanner;

public class Solution3 {
    public static void main(String args[]) {
        int  count=0;
        Scanner n = new Scanner(System.in);
        System.out.println("enter the string");
        String s = n.nextLine();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 &&ch[i]<=90){
                count +=1;
            }

        }
        System.out.println(count);
    }
}

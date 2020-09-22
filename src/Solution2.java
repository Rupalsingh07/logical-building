import java.util.Scanner;

public class Solution2 {
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.println("enter the first name");
        String s1=n.nextLine();
        System.out.println("enter the middle name");
        String s2=n.nextLine();
        System.out.println("enter your last name");
        String s3=n.nextLine();
        String p=s1.charAt(0)+"."+s2.charAt(0)+"."+s3.charAt(0);
        System.out.print(s1 +" "+s2+" "+ s3 +"-"+p);






















    }
}

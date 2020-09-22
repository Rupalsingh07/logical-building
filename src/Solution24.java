import java.util.Scanner;

public class Solution24 {


    public static void main(String args[]) {
          int i=0,j=0;
        Scanner n = new Scanner(System.in);
        String s1[] = new String[10];
        String s2[] = new String[10];
        System.out.println("enter country names");
        for ( i = 0; i <7; i++) {
            s1[i] = n.nextLine();
        }
        System.out.println("enter wonder names");
        for ( j= 0; j<7; j++) {
            s2[j] = n.nextLine();
        }

        System.out.println("enter the county name you want");
        String c=n.nextLine();
        for(int k=0;k<7;k++) {
            if (s1[k].equals(c)) {

                System.out.println("the wonder name of choosen country is \t" + s2[k]);
            }

        }
    }



}

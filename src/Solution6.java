import java.util.Scanner;

public class Solution6 {
    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);

        System.out.println("enter the  first string");
        String s1 = n.nextLine();
        System.out.println("enter the  second string");
        String s2 = n.nextLine();
        if (s1.equals(s2)) {
            System.out.println("they are equal");

        }
        else{
            System.out.println("they are not equal");
        }


    }
    }

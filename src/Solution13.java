import java.util.Scanner;

public class Solution13 {
    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);
        System.out.println("enter first string");

        String s1 = n.nextLine();
        System.out.println("enter second string");
        String s2 = n.nextLine();
        if (s1.compareTo(s2) > 0) {
            System.out.println(s2 + "comes first in lexicographically" + s1);

        }
        else if (s1.compareTo(s2)==0) {
            System.out.println("both string are equal");
        }
        else{
            System.out.println(s1 + "  comes first in lexicographically from   " + s2);
        }
    }
}

import java.util.Scanner;
import java .lang.*;

public class Solution17 {


    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);
        System.out.println("enter the string");

        String s = n.nextLine();
        char ch[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
            if (ch[i] >= 65 && ch[i] <= 90) {
                ch[i] = Character.toLowerCase(ch[i]);
            } else if (ch[i] >= 97 && ch[i] <= 122) {
                ch[i] = Character.toUpperCase(ch[i]);


            }


            System.out.print(ch[i]);
        }

    }
}

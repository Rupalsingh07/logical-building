import java.util.Scanner;

public class Solution21 {

    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter the string");
        String s = n.nextLine();
        String[] words = s.split(",", s.length());
        String p = new String();
        char ch[] = new char[words.length];
        for (int j = 0; j < words.length; j++) {
            for (int i = words[j].length(); i > 0; i--) {
                ch[i] = words[j].charAt(i);
            }
            p = String.valueOf(ch);
            if (p.equals(words[j])) {
                System.out.println(words[j]);
            }
        }
    }
}

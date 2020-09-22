import java.util.Scanner;

public class Solution19 {
    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);
        System.out.println("enter the string");

        String s = n.nextLine();
        char ch[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++){
            ch[i] = s.charAt(i);
            if (i == 0){
                ch[i] = Character.toUpperCase(ch[i]);
            }
            else if (ch[i-1] == ' '){
                ch[i] = Character.toUpperCase(ch[i]);
            }
            System.out.print(ch[i]);
        } }

}

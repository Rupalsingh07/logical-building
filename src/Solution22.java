import java.util.Scanner;

public class Solution22 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s = n.nextLine();
        String[] d = s.split(" ", s.length());
        for (int i = 0; i < d.length; i++) {
            for (int j =0; j<d[i].length()-1; j++) {
                if (d[i].charAt(j)==d[i].charAt(j+1)){
                    System.out.println("double sequence word in sentence is  " + d[i]);

                }
            }

        }
    }
}

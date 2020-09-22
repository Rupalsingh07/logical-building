import java.util.Scanner;

public class Solution16 {


    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);
        String s[] = new String[10];
        System.out.println("enter  the  names");
        for (int i = 0; i < 5; i++) {
            s[i] = n.nextLine();
        }

        for (int j = 0; j < 5; j++) {
           for(int i=0;i<1;i++){
              if((s[j].charAt(i))=='A'|| (s[j].charAt(i))=='E' ||(s[j].charAt(i))=='I'||(s[j].charAt(i))=='O'||(s[j].charAt(i))=='U'){
                  System.out.println(s[j]);
              }
           }

        }

    }
}

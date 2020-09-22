import java.util.Scanner;

public class Solution20 {

    public static void main(String args[]) {
        int count = 0;
        Scanner n = new Scanner(System.in);
        System.out.println("enter the string");
        String s = n.nextLine();
        String []words= s.split(" ",s.length());
          for(int i=0;i<words.length;i++){
              if(words[i].length()>5){
                  System.out.println(words[i]);

            }


        }
    }
}
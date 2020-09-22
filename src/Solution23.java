import java.util.Scanner;

public class Solution23 {
    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);
        int arr[] = new int[10];
        String name[]=new String[20];
        System.out.println("enter the roll nos");
        for (int i = 0; i < 5; i++) {

            arr[i] = n.nextInt();
        }

        System.out.println("enter the names");
        for (int i = 0; i<5; i++) {
            name[i] = n.next();
        }



        System.out.println("rollno"+"  "+"names");
        for(int j=0;j<5;j++){
            System.out.println(arr[j]+"         "+name[j]);
        }

    }
}

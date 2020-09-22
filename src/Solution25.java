import java.util.Arrays;
import java.util.Scanner;
public class Solution25 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int arr[]=new int[10];
        String s[]= new String[20];
        System.out.println("no of students");
        int no=n.nextInt();
        n.nextLine();
        System.out.println("enter the name");
        for(int i=0;i<no;i++) {
            s[i] = n.nextLine();
        }
        System.out.println("enter the marks");
        for(int i=0;i<no;i++) {
            arr[i] = n.nextInt();
        }
        //sorted array
        Arrays.sort(arr);
        System.out.println("s.no "+ "name"+" marks");
        for(int i=0;i<=arr.length;i++){
         System.out.println(i+ "\t"+ s[i]+ "\t"+ arr[i]);
           }
        }
    }

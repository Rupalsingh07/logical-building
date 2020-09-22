import java.util.Scanner;

public class Solution12 {
    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);
        System.out.println("enter the name");
        String s = n.nextLine();
        if (s.contains("miss")||s.contains("Kumari")) {

            System.out.println("Female");
        }
        else if(s.contains("mr")){
            System.out.println("Male");
        }
        else if(s.contains("mrs")){
            System.out.println("Married Female");
        }
        else{
            System.out.println("Cannot Determined");
        }








    }

    }

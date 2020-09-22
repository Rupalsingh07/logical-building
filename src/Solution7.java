import java.util.Scanner;

public class Solution7 {
    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);
        System.out.println("enter the day");

        String day = n.nextLine();
        switch (day) {
            case "Monday": System.out.println("1");
            case "Tueday": System.out.println("2");
            case "Wednesday": System.out.println("3");
            case "Thursday": System.out.println("4");
            case "Friday": System.out.println("5");
            case "Saturday":System.out.println("6");
            case "Sunday": System.out.println("7");

            default:
                System.out.println("you have given wrong intput");

        }

    }
}

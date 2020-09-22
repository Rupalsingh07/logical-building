import java.util.Scanner;

public class Solution11 {

    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);
        System.out.println("enter the string");

        String s1 = n.nextLine();
        char ch[]=new char[s1.length()];
        String piglatin="";
        int flag=0;
        for(int i=0;i<s1.length();i++){
            ch[i]=s1.charAt(i);
            if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                piglatin=s1.substring(i)+s1.substring(0,i)+"ay";
                flag=1;
                break;

            }

            }
        if(flag==0){
            piglatin=s1+"ay";
        }
        System.out.println(s1+" in piglatin format is "+piglatin);
        }

}

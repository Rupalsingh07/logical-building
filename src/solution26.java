public class solution26 {


    public static void main(String args[]) {

        String s = "JAVA";

       String []s1=s.split("",s.length()) ;
       for(int i=0;i<s.length();i++){
           for(int j=0;j<i+1;j++){
               System.out.print(s1[j]);
           }
System.out.println();


}

    }
}
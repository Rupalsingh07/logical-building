public class Solution28 {

    public static void main(String args[]) {

        String s ="COMPUTER";
        String []p=s.split("",s.length());
        for(int i=0;i<p.length;i++){
            if(i==0){
               for(int j=0;j<p.length;j++)
                   System.out.println(p[i+j]);
           }
            else{
                for(int j=0;j<p.length-1;j++)
                   System.out.println(p[i+j]);
           }

            }
        }

    }


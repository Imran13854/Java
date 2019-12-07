import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        
        for(int i=0;i<t;i++){
            int result=0;
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            result=a+1*b;
            System.out.print(result+" ");
            for(int j=1;j<n;j++)
            {
            int pow = (int)Math.pow(2,j);
            result+=pow*b;
            System.out.print(result+" "); 
            }
            System.out.println("");
        }
        in.close();
    }
}


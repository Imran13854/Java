import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int lines = 1;
         try{
        String line = input.nextLine();
        System.out.println(lines + " " + line);
        while (true)
        {
             lines++; 
            
             line = input.nextLine();
             if(line.equals("EOF")){
                break;
            }
            else{
            System.out.println(lines + " " + line);
                }
             }
         }
             catch(Exception e){
                 e.printStackTrace();
             } 
        
        input.close();
    }
}


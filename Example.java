import java.util.Scanner;

public class Example
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of names: ");
        int numNames = in.nextInt();
        String[][] names = new String[numNames][2];
        
        for(int r = 0; r < names.length; r++)
        {
            System.out.print("Enter the name (Ex: \"King\"): ");
            String name = in.next();
                
            names[r][0] = name;
            
            System.out.print("Enter the nickname (Ex: \"King\"): ");
            String nickname = in.next();
                
            names[r][1] = nickname;
        }
        
        System.out.println("\n\n\nName\tNickname");
        System.out.println("---------------------------");
        
        for(int r = 0; r < names.length; r++)
        {
            for(int c = 0; c < names[r].length; c++)
            {
                System.out.print(names[r][c] + "\t");
            }
            
            System.out.print("\n");
        }
    }
}


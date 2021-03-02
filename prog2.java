import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String states[] = new String[10];
        String cap[] = new String[10];
        boolean result=false;
        int a =0;

        for(int i = 0; i<10; i++)
        {
            System.out.println("Enter the State name");
            states[i] = sc.nextLine();
            System.out.println("Enter the Capital");
            cap[i] = sc.nextLine();
        }

        System.out.println("Enter The State name for whom u want capital");
        String str = sc.nextLine();

        for(int j = 0; j < 10; j++)
        {
            if(states[j].equals(str))
            {
                result=true;
                a=j;
            }
        }
        if(result==true)
        {
            System.out.println("The Captial of "+str+" is "+cap[a]);
        }
        else
        {
            System.out.println("No such Data");
        }
    }
}

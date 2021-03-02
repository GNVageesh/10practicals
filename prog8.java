import java.util.Scanner;

public class prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        boolean r = false;
        char ch;
        String[] plname = new String[3];
        String[] conname = new String[3];
        int[] inn =  new int[3];

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter player name");
            plname[i] = sc.next();
            System.out.println("Enter country name");
            conname[i] = sc.next();
            System.out.println("Enter player innings");
            inn[i] = sc.nextInt();
        }

        System.out.println("Enter the first character of the country");
        ch = sc.next().charAt(0);
        System.out.println("Name \t Country \t Innings");
        for(int j = 0; j < 3; j++)
        {
            if(ch == conname[j].charAt(0))
            {
                r = true;
                System.out.println(plname[j] + "\t" + conname[j] + "\t" + inn[j]);
            }

        }

        if(r == false)
        {
            System.out.println("No such data found");
        }

    }
}

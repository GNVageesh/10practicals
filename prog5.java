import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] name = new String[3];
        int[] m1 = new int[3];
        int[] m2 = new int[3];
        int[] m3 = new int[3];
        double[] avg = new double[3];
        boolean r = false;
        int a = 0;

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter the Student name");
            name[i] = sc.next();
            System.out.println("Enter marks in Subject 1");
            m1[i] = sc.nextInt();
            System.out.println("Enter marks in Subject 2");
            m2[i] = sc.nextInt();
            System.out.println("Enter marks in Subject 3");
            m3[i] = sc.nextInt();
            avg[i] = (m1[i]+m2[i]+m3[i])/3;
        }

        System.out.println("Enter the name of the student to get results");
        String n = sc.next();

        for(int j = 0; j < 3; j++)
        {
            if(n.equalsIgnoreCase(name[j]))
            {
                r = true;
                a = j;
            }
        }

        if(n.equalsIgnoreCase(name[a]))
        {
            if(avg[a] >= 80 && avg[a] <=100)
            System.out.println("EXCELLENT");
            else if(avg[a] >= 60 && avg[a] <80)
            System.out.println("DISTINCTION");
            else if(avg[a] >= 40 && avg[a] <60)
            System.out.println("GOOD");
            else
            System.out.println("POOR");
        }
        else
        {
            System.out.println("No such name in the array");
        }
    }
}

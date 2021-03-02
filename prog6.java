import java.util.Scanner;

public class prog6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int len = arr.length;
        boolean result = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int num = sc.nextInt();

        for(int i = 0; i < len; i++)
        {
            if(num == arr[i])
            {
                result = true;
            }
        }
        if(result == true)
        {
            System.out.println("Number is found");
        }
        else
        {
            System.out.println("Number not found");
        }
    }
}

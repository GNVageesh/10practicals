public class sum {
    public static void main(String[] args) {
        int[] arr = {1,2,10};
        int len = arr.length;

        int sum = 0;

        for(int i = 0; i < len; i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("The sum is: "+sum);
    }
}

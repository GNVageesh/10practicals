public class prog3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int len = arr.length;
        int max, min, sum = 0;

        System.out.println("The given array is:");

        for(int i = 0; i < len; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        max = arr[0];
        min = arr[0];

        for(int j = 0; j < len; j++)
        {
            if(max < arr[j])
            {
                max = arr[j];
            }
            if(min > arr[j])
            {
                min = arr[j];
            }
            sum = sum + arr[j];
        }

        System.out.println("The Greatest number is: "+max);
        System.out.println("The Smallest number is: "+min);
        System.out.println("The Sum of the given array is: "+sum);
    }
}

public class max_min {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int len = arr.length;
        int min, max;

        max = arr[0];
        min = arr[0];

        for(int i = 0; i <len; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
            if(min>arr[i])
            {
                min = arr[i];
            }
        }

        System.out.println(max + " " + min);

    }
}

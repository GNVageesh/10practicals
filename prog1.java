public class prog1
{
    public static void main(String[] args) {
        int[] arr = {21,2,12,1,2,3,4,62,9,10,20,17,10,18,0};
        int len = arr.length;

        for(int i= 0; i<=len-1; i++)
        {
            for(int j = 0; j <len-i-1; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }

        for(int c = 0; c < len; c++)
        {
            System.out.println(arr[c]);
        }
    }
}
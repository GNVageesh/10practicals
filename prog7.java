public class prog7 {
    public static void main(String[] args) {
        
        int P[] = {4, 6, 1, 2, 3, 10};
        int Q[] = {19, 23, 7, 8};
        int R[] = new int[10];
        int len = R.length;

        System.arraycopy(P, 0, R, 0, 6);
        System.arraycopy(Q, 0, R, 6, 4);

        for(int i = 0; i < len; i++)
        {
            System.out.print(R[i] + " ");
        }
    }
}

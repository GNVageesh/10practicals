public class prog4 {
    public static void main(String[] args) {
        String[] city = {"Vageesh", "Computer", "Linux", "Windows"};
        int len = city.length;

        for(int i = 0; i < len; i++)
        {
            for(int j = 0; j < len -i-1; j++)
            {
                if(city[j].compareToIgnoreCase(city[j+1])>0)
                {
                    String tem = city[j];
                    city[j] = city[j+1];
                    city[j+1] = tem;
                }
            }
        }

        System.out.println("The sorted array is: ");
        for(int c = 0; c < len ; c++)
        {
            System.out.println(city[c]);
        }
    }
}

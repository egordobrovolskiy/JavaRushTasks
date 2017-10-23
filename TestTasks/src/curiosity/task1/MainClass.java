package curiosity.task1;

public class MainClass
{
    public static void main(String[] args)
    {
        int n = 5;
        int sum = 0;

        for (int i = 0; i< n; i++)
        {
            sum += i;
        }

        print(sum);
        System.out.println(sum);
    }

    private static void print(int sum) {
        System.out.println(sum);
    }
}
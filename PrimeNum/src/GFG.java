import java.util.Scanner;
public class GFG {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print(getLargestPrime(n));
    }

    public static int getLargestPrime(int number)
    {
        if(number <= 0 || number == 1)
            return -1;

        else
        {
            boolean flag = true;
            if(number == 2)
                return 2;
            for(int i=number; i>=2; i--)
            {
                for(int j = i-1; j>=2; j--)
                {
                    if(i % j == 0)
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    return i;
                flag = true;
            }
        }
        return -1;
    }
}

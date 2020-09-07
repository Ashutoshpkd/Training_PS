import java.util.Scanner;
public class GFG {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print(getLargestPrime(n));
        inputThenPrintSumAndAverage();
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
    public static void inputThenPrintSumAndAverage()
    {
        Scanner input = new Scanner(System.in);
        String str;
        int sum,count=0;
        long avg;

        while(true)
        {
            str = input.nextLine();
            if(str >= 'a' && str <= 'z' || str >= 'A' && str <= 'Z')
            {
                break;
            }
            count++;
            int n = Integer.parseInt(str);
            sum += n;
        }

        avg = Math.round(sum/count);
        System.out.println("SUM = "+sum+" AVG = "+avg);

    }
}

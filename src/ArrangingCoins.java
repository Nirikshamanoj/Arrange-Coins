import java.util.Scanner;
public class ArrangingCoins
{
    static void findCount(int n)
    {
        int row=1,count=0;
        while(n>row)
        {
            n-=row;
            row++;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        findCount(n);
    }
}

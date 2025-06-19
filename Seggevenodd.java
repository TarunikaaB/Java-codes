import java.util.Scanner;
public class Seggevenodd
{
    public static void main(String[] args)
    {
        System.out.println("Enter Number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int dig,even=0,epv=1,odd=0,opv=1;
        while(num!=0)
        {
            dig = num%10;
            if(dig%2==0)
            {
                even = dig * epv + even;
                epv=epv*10;
            }
            else
            {
                odd = dig * opv + odd;
                opv*=10;
            }
            num/=10;
        }
        int res = even*opv+odd;
        System.out.println(res);
    }
}

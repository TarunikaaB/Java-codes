import java.util.Scanner;
public class Pseudobinarynumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter a number: ");
        int num = input.nextInt(); ///num = 53
        int pv,cons,dig;
        while(num!=0)/// 42!=0
        {
            pv=1;
            cons=0;
            while (num / pv != 0) /// 0!=0
            {
                dig = (num / pv) % 10; ///dig = 5%10=5
                if (dig > 0)/// 5>0
                    cons = 1 * pv + cons;//cons=1*10+1=11
                else
                    cons = 0 * pv + cons;
                pv = pv * 10;///pv=100
            }
            num = num - cons; ///num=53-11=42
            if(num==0)
                System.out.println(cons);
            else
                System.out.print(cons+"+");///11
        }
    }
}

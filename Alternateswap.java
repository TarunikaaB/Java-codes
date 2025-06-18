import java.util.Scanner;
public class Alternateswap
{
    public static void main(String[] args)
    {
        System.out.println("Enter Number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();///123456
        int last_dig=-1,pair,swap,cons=0,pv=1;
        int nod = (int)Math.log10(num)+1;
        if(nod%2==1)
        {
            last_dig = num%10;
            num = num/10;
        }
        while(num!=0) {
            pair = num % 100;///pair=56
            swap = (pair % 10) * 10 + (pair / 10);
            cons = swap * pv + cons;
            pv = pv * 100;
            num = num / 100;
        }
        if(nod%2==1)
        {
            int res = cons * 10 + last_dig;
            System.out.println(res);
        }
        else
        System.out.println(cons);
    }
}

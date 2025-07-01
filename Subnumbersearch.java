import java.util.Scanner;
public class Subnumbersearch {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int nod=(int)Math.log10(num2)+1;///45=>2
        int pv=(int)Math.pow(10,nod);///10^2
        int dig;
        while(num1!=0)
        {
            dig=num1%pv;
            if(dig==num2)
            {
                System.out.println("yes");
                break;
            }
            else
            {
                num1=num1/10;
            }
        }
        if(num1==0)
        System.out.println("No");
    }
}

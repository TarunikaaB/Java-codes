import java.util.Scanner;

public class Leftconstruction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dig,res=0,pv=1;
        while(true)
        {
            dig = input.nextInt();
            if(dig == -1)
                break;
            res = dig * pv + res;
            pv=pv*10;
            System.out.printf("%d %d\n",dig,res);
        }
    }
}

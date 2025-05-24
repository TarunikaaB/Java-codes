import java.util.Scanner;

public class Rightconstruction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dig,res=0;
        while(true)
        {
            dig = input.nextInt();
            if(dig == -1)
                break;
            res = res * 10 + dig;
            System.out.printf("%d %d\n",dig,res);
        }
    }
}

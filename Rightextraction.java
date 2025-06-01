import java.util.Scanner;

public class Rightextraction {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            System.out.println("Enter a Number: ");
            int dig;
            while(num!=0)
            {
                dig = num%10;
                System.out.printf("%d %d\n",num,dig);
                num=num/10;
            }
            System.out.println(num);
        }
    }
}

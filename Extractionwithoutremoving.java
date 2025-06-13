import java.util.Scanner;

public class Extractionwithoutremoving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = input.nextInt();
        int dig,pv=1;
        while(num/pv!=0)
        {
            dig = (num/pv)%10;
            System.out.printf("%d %d\n",num,dig);
            pv=pv*10;
        }
        System.out.println(num);
    }
}

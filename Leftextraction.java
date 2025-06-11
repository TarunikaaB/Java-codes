import java.util.Scanner;

public class Leftextraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int dig,pv=1;
        /*int nod = (int)Math.log10(num)+1;
        int pv = (int)Math.pow(10,nod-1);
         */
        while(num/pv!=0)
            pv=pv*10;
        pv=pv/10;
        while(pv!=0)
        {
            dig = (num/pv)%10;
            System.out.printf("%d %d\n",num,dig);
            pv=pv/10;
        }
        System.out.println(num);
    }
}

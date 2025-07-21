import java.util.Scanner;

public class Numberpattern1 {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int row,col,val;
        int sqr = N * N;
        int nod = (int)Math.log10(sqr)+1;
        for(row=0; row<N; row+=2,System.out.println())/// row=0
        {
            val = N * row + 1;///val = 5*0+1=1
            for(col=1; col<=N; col++)
            {
                System.out.printf("%0"+nod+"d ",val++);///1
            }
        }
        int start=(N/2)*2-1;
        for(row=start; row>=1; row-=2,System.out.println())
        {
            val = N*row+1;
            for(col=1;col<=N;col++)
                System.out.printf("%0"+nod+"d ",val++);
        }
    }
}

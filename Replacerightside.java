import java.util.Scanner;

public class Replacerightside {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int ind,sum=0;
        for(ind=0;ind<size;ind++) {
            arr[ind] = input.nextInt();
            sum=sum+arr[ind];
        }
        for(ind=0; ind<size; ind++)
        {
            arr[ind] = sum - arr[ind];
            sum = arr[ind];
        }
        for(ind=0;ind<size;ind++)
            System.out.print(arr[ind]+" ");
    }
}

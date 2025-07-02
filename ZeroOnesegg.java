import java.util.Scanner;

public class ZeroOnesegg {
    public static void zeroonesegg(int[] arr,int size)
    {
        int front,rear,temp;
        front=0;
        rear=size-1;
        while(front<rear)
        {
            while (arr[front] == 0)
                front++;
            while (arr[rear] == 1)
                rear--;
            if(front < rear) {
                temp = arr[front];
                arr[front] = arr[rear];
                arr[rear] = temp;
            }
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int ind;
        for(ind=0;ind<size;ind++)
            arr[ind] = input.nextInt();
        zeroonesegg(arr,size);
        for(int num : arr)
            System.out.print(num+" ");
    }
}

import java.util.Scanner;

public class Pseudobinarynumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = input.nextInt();

        while (num != 0) {
            int pv = 1, cons = 0, temp = num;

            while (temp != 0) {
                int dig = temp % 10;
                if (dig > 0) {
                    cons += pv;
                }
                temp /= 10;
                pv *= 10;
            }

            num -= cons;

            if (num == 0) {
                System.out.print(cons);
            } else {
                System.out.print(cons + "+");
            }
        }
    }
}

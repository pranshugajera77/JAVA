import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num, sum = 0;

        System.out.println("Enter a Number: ");
        num = sc.nextInt();

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        System.out.println("The sum of digit: "+ sum);

    }
}

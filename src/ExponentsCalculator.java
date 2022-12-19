import java.util.Scanner;

public class ExponentsCalculator {
    static int calculation(int pow, int base) {
        if (pow == 0) {
            return 1;
        }
        return calculation(pow - 1, base) * base;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, pow;
        do {
            System.out.print("Enter the base number(x) : ");
            base = scanner.nextInt();

            System.out.print("Enter the exponent number(n) : ");
            pow = scanner.nextInt();

            System.out.println(calculation(pow, base));

        } while ((base >= 0) && (pow >= 0));

    }
}

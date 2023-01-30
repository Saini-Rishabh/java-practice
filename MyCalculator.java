import java.util.*;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class MyCalculator {

    void power(int n, int p) {
        int m = n;
        while (p != 1) {
            n = n * m;
            p--;
        }
        System.out.println("Answer: " + n);
    }

    public static void main(String k[]) {

        try {
            MyCalculator obj = new MyCalculator();
            int n, p;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the First Number");
            n = sc.nextInt();
            System.out.println("Enter the Second Number");
            p = sc.nextInt();
            if (n == 0 || p == 0) {
                throw new MyException("Either n or p cannot be 0");
            }
            if (n < 0 || p < 0) {
                throw new MyException("Either n or p cannot be Negative");
            }

            obj.power(n, p);

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
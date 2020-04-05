import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long n = 0;
        long count = 0;
        while (a > 0) {
            n = a % 10;
            count++;
            a = a / 10;
        }
        long rs = (count + 3);
        long factorial = 1;
        for (int i = 1; i <= rs; i++)
            factorial = factorial * i;

        if (factorial > a)
            System.out.println(rs);
        if (a == factorial)
            System.out.println(rs + 1);
        if (a > factorial)
            System.out.println(rs + 1);
    }
}
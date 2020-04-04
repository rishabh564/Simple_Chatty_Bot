import java.util.Scanner;

class Main {
    static void print(int n) {
        while (n != 1) {
            System.out.print(n + " ");
            if ((n & 1) == 1)
                n = 3 * n + 1;
            else
                n = n / 2;
        }
        System.out.print(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}
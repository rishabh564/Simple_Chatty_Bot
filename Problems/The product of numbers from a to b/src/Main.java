import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long res = 1;
        for (long i = a; i < b; i++)
            res = res * i;
        System.out.println(res);
    }
}
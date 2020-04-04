import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long sum = 0;
        for (long i = a; i <= b; i++)
            sum = sum + i;
        System.out.println(sum);
    }
}
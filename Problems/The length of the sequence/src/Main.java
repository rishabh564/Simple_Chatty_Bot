import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int c = 0;
        while (true) {
            int a = sc.nextInt();
            if (a == 0) {
                n++;
                break;
            }
            if (c == 0)
                c++;
            n++;
        }

        if (c == 0)
            System.out.println(0);
        else
            System.out.println(n - 1);
    }
}
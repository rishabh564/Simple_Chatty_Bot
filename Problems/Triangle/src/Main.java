import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int a = n1 + n2;
        int b = n2 + n3;
        int c = n3 + n1;
        if (a > n3)
            System.out.println("YES");
        else if (b > n1)
            System.out.println("YES");
        else if (c > n2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] ar = new int[a];
        for (int i = 0; i < a; i++)
            ar[i] = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            if (ar[i] == 2)
                arr[2] += 1;
        }
        }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] ar = new int[a];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int[] arr = new int[a];
        int j = 0;

        for (int i = 0; i < ar.length; i++) {
            int div = ar[i] % 4;
            if (div == 0) {
                arr[j] = ar[i];
                j += 1;
            }
        }
    }
}
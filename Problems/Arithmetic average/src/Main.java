import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float[] arr = new float[100];
        int j = 0;
        for (float i = a; i <= b; i++) {
            float div = i % 3;
            if (div == 0) {
                arr[j] = i;
                j += 1;
            }
        }
    }
}


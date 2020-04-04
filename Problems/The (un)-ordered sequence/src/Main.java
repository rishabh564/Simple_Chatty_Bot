import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4000];
        int i = 0;
        while (sc.hasNextInt()) {
            arr[i] = sc.nextInt();
            i++;
        }

        int desc = arr[0];
        int notDesc = 0;
        int notAsc = 0;
        int asc = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (desc < arr[j])
                notDesc = 1;

            if (asc > arr[j])
                notAsc = 1;
        }

        if (notAsc == 0)
            System.out.println(true);
        else if (notDesc == 0)
            System.out.println(true);
        else
            System.out.println(false);

    }
}
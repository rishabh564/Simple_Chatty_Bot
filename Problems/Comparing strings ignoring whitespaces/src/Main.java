import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = a.replaceAll("\\s+", "");
        String d = b.replaceAll("\\s+", "");
        if (c.equalsIgnoreCase(d))
            System.out.println(true);
        else
            System.out.println(false);
    }
}


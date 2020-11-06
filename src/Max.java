import java.util.Scanner;

public class Max {
    static int f() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n == 0) {
            return 0;
        } else {
            return Math.max(n, f());
        }
    }
    public static void main(String[] args) {
        System.out.println(f());
    }
}

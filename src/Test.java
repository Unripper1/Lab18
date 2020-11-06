import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        boolean[] isPrime=new boolean[N];
        Arrays.fill(isPrime,true);
        isPrime[1] = false;
        for (int i=2; i*i < N; i++)
            if (isPrime[i]) {
                for (int j = i * i; j < N; j += i) {
                    isPrime[j] = false;
                }
            }
        for (int i=0;i<N;i++){
            if(isPrime[i]==true)
                System.out.println(i);
        }

    }
}

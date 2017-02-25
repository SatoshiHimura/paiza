import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
           String line = String.valueOf(N);
            line = "*";	
            System.out.print(line);
        }
        System.out.println();
    }
}
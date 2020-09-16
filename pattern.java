import java.util.Scanner;
public class pattern{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int N = sc.nextInt();
        int x = N*2-1;

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < x; k++) {
                System.out.print("*");
            }
            x-=2;
            System.out.println();
        }

        x = 1;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < x; k++) {
                System.out.print("*");
            }
            x += 2;
            System.out.println();
        }
    }
}

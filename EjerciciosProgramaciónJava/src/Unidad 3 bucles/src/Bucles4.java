
import java.util.Scanner;


public class Bucles4 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce B y luego A: ");
        int B = lector.nextInt();
        for (int A = lector.nextInt();B>=A;B--){
            System.out.println(A);
        }
    }
}

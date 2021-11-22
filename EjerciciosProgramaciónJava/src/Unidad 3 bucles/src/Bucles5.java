import java.util.Scanner;
public class Bucles5 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int A = lector.nextInt();
        for (int B = lector.nextInt(); A>=B; A-=2){
            System.out.println(A);
        }
                
    }
}

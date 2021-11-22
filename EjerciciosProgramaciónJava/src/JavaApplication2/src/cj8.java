import java.util.Scanner;
public class cj8 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int A;
        int B;
        A = lector.nextInt();
        B = lector.nextInt();
        if (A % B == 0){
            System.out.println("A es múltiplo de B");
        }
        else {
            System.out.println("A no es múltiplo de B");
        }
    }
}
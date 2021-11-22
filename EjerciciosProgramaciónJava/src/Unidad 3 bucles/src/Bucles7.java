import java.util.Scanner;
public class Bucles7 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int suma = 0;
        int num1 = lector.nextInt();
        for (int num2 = lector.nextInt(); num1 <= num2; num1++){
        suma += num1;
    }
    System.out.println(suma);
    }
    
    
}

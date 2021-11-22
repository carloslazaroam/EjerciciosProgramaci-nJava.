import java.util.Scanner;

public class cj3 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int numero1;
        int numero2;
        numero1 = lector.nextInt();
        numero2 = lector.nextInt();
        if (numero1>numero2){
            System.out.print("El mayor es: " + numero1);
        }   
        else{
            System.out.print("El mayor es: " + numero2);  
        }
        
    }
}
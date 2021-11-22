import java.util.Scanner;
public class cj10 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce 2 números:");
        double numero1;
        double numero2;
        numero1 = lector.nextDouble();
        numero2 = lector.nextDouble();
        double suma = numero1 + numero2;
        System.out.println(suma);
        double resta = numero1 - numero2;
        System.out.println(resta);
        double producto = numero1 * numero2;
        System.out.println(producto);
        double division = numero1 / numero2;
        if (numero2 == 0){
           System.out.println("Error"); 
        }
        System.out.println(division);
    }
}
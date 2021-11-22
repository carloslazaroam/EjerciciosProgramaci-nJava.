import java.util.Scanner;
public class cj6{
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        double numero1 = lector.nextDouble();
        double numero2 = lector.nextDouble();
        if (numero1 > numero2){
            System.out.print("El mayor es: " + numero1);
        }
        
        else if(numero1== numero2){
            System.out.print("Los números son iguales");
        }
        else {
            System.out.print("El mayor es: " + numero2);
        }
        
    }
}
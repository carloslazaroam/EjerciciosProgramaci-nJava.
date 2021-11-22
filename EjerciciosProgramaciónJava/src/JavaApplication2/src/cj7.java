import java.util.Scanner;
public class cj7 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        double numero1;
        double numero2;
        double numero3;
        numero1 = lector.nextDouble();
        numero2 = lector.nextDouble();
        numero3 = lector.nextDouble();
        
        if (numero1>=numero2 && numero1>=numero3 ){
            System.out.println("El mayor es el:" + numero1);
        }
        
        if (numero2>=numero1 && numero2>=numero3){
            System.out.println("El mayor es el: " + numero2);
        }
        if (numero3>=numero1 && numero3>=numero2){
            System.out.println("El mayor es el: " + numero3);
        }
    }
}
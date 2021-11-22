import java.util.Scanner;
public class cj15 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce 3 notas:");
        double numero1;
        double numero2;
        double numero3;
        numero1 = lector.nextDouble();
        numero2 = lector.nextDouble();
        numero3 = lector.nextDouble();
        double notafinal = (numero1 + numero2 + numero3) / 3;
        notafinal = Math.round(notafinal);
        
        if ((numero1<5||numero2<5||numero3<5)notafinal= 4){
            System.out.print("La nota final es: " + notafinal);
        }
        
            
        
        
        
    }
}
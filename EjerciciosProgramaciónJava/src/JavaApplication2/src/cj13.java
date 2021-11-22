import java.util.Scanner;
public class cj13 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int numero;
        numero = lector.nextInt();
        if (numero<10){
            System.out.println("Frío");
        }
        else if ( numero >=19){
            System.out.println("Templado");
        }
         else if (numero>=29){
            System.out.println("Caluroso");
        }
         else{
            System.out.println("Tropical");
        }
      
            
        
    }
}
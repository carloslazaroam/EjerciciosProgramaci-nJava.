import java.util.Scanner;

public class cj2 {
    
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        
        int edad;
        edad = lector.nextInt();
        if (edad>=18){
            System.out.print("Eres mayor de edad");
        }
        else{
            System.out.print("Eres menor de edad");
        }
        
    }
}
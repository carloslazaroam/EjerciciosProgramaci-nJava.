import java.util.Scanner;
public class Strings6 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String F = lector.nextLine();
        System.out.println("Introduce una palabra");
        
        String P = lector.nextLine();
        
        if (F.indexOf(P) >0){
            System.out.println("Correcto");
            
        }
        else {
            System.out.println("No es correcto");
        }
        if (F.startsWith(P)){
            System.out.println("La frase empieza por la palabra");
            
        }
        else {
            System.out.println("La frase no empieza por la palabra");
        }
        if (F.endsWith(P)){
            System.out.println("La frase si termina por palabra");
        }
        else {
            System.out.println("La frase no termina por la palabra");
        }
        
    }

}

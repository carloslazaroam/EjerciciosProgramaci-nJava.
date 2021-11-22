import java.util.Scanner;
public class Strings7 {
    public static void main (String[]args){
        Scanner lector = new Scanner(System.in);
        String Frase = lector.nextLine();
        String P1 = lector.nextLine();
        String P2 = lector.nextLine();
        System.out.println(Frase.replace(P1,P2));
        
    }
    

}

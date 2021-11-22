import java.util.Scanner;
public class BetaBucles5 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int A = lector.nextInt();
        for(int B = lector.nextInt();A<=B;A++){
            if (A%2==0){
                pares += A;
                
            }
            else {
                impares +=A;
            }
        }   
        System.out.print("La suma de pares es de: " + pares);
        System.out.print("La suma de impares es de: " + impares);
    }

}

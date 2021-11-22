import java.util.Scanner;
public class cj9 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce 2 números");
        double num1;
        double num2;
        num1 = lector.nextDouble();
        num2 = lector.nextDouble();
        if (num1 % num2 ==0 || num2 % num1 ==0){
             System.out.println("Al menos un número es múltiplo del otro");
        }
        else {
            System.out.println("No son múltiplos");
        }   
            
      
        
        
            
            
        
        
        
    }
}
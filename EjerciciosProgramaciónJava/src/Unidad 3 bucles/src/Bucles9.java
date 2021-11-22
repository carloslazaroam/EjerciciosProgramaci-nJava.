import java.util.Scanner;
public class Bucles9 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int mult = 1;
        int num1 = lector.nextInt();
        for (int num2 = lector.nextInt(); num1 <= num2; num1++){
        mult *= num1;
    }
    System.out.println(mult);
    }
    
    
}

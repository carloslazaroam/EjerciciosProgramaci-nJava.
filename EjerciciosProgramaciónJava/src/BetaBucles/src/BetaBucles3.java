import java.util.Scanner;
public class BetaBucles3 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int posit = 0;
        int neg = 0;
        int i;
        do {
         i = lector.nextInt();
         if (i >= 0){
             posit = posit + 1;
         }
         else {
             neg = neg + 1;
         }
            
        } while(i != 0);
        System.out.println("Total positivos: " + posit);
        System.out.println("Total negativos: " +neg);
        
    }

}

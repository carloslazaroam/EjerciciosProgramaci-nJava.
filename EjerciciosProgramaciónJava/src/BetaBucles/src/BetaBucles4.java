import java.util.Scanner;
public class BetaBucles4 {
  public static void main(String[]args){
    Scanner lector = new Scanner(System.in);
    int i;
    int total = 0;
    int media = 0;
    int cont = 0;
    do {
         i = lector.nextInt();
         
         total += i;
         cont = cont + 1;
         
         
         if (i == -1){
             total += 1;
             cont = cont - 1;
                     
         }
         media = total / cont;
         if (i == 10){
            System.out.println("Hubo algún 10");
         }
            
        } while(i != -1);
    
    
        System.out.println("La suma total es de:" + total);
        System.out.println("La media es de: " + media);
  }
}

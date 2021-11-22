import java.util.Scanner;
public class JavaArrays {
    public static void main(String[]args){
        int[] vec = new int[20];
        int suma = 0;
        int cont = 0;
        
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < 20;i++){
            System.out.print("Introduce un número: ");
            vec[i] = lector.nextInt();
            
        }
        for(int i = 0; i < 20;i++){
            suma = suma + vec[i];
            cont = cont + 1;
        }
      
        
        
        
        
    }
}

import java.util.Scanner;


public class GammaBucles5 {
public static void main(String[]args){
    Scanner lector = new Scanner(System.in);
    int suma = 0;
    int X = lector.nextInt();
    for (int i = 1; i <=X;i++){
        for(int j = 1;j<=10;j++){
            suma += (i*j);
            System.out.println(i + "x" + j + "=" + (i*j));
            
            
            
        }
        System.out.println("La suma total es: " + suma);
    }   
}
}



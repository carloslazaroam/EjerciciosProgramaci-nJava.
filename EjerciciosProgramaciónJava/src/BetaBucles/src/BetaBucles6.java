import java.util.Scanner;
public class BetaBucles6 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int A = lector.nextInt();
        int mult;
        for(int B = lector.nextInt(); A <= B;A*=B){
            mult = A * B;
            System.out.println(mult);
        }
        
    }

}

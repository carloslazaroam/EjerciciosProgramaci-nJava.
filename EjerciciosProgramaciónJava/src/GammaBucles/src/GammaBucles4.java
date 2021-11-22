import java.util.Scanner;
public class GammaBucles4 {
public static void main(String[]args){
    Scanner lector = new Scanner(System.in);
    int X = lector.nextInt();
    for (int i = 1; i <=X;i++){
        for(int j = 1;j<=10;j++){
            System.out.println(i + "x" + j + "=" + i*j);
        }
    }
}
}

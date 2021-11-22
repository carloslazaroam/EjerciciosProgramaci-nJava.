import java.util.Scanner;
public class cj16 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        double numero;
        numero = lector.nextDouble();
        double dado = Math.random () * (5 - 1 + 1) + 1;
        dado = Math.round(dado);
        System.out.println(dado);
        if (dado == numero) {
            System.out.println("Ha acertado");
        }
        else {
            System.out.println("No ha acertado");
        }
    }
}
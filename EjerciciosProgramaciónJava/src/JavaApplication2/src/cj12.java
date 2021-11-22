import java.util.Scanner;
public class cj12 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero;
        numero = lector.nextInt();
        
        String dias;
        switch (numero) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                dias = "31";
                break;
            case 4:case 6:case 9:case 11:
                dias = "30";
                break;
            case 2:
                dias = "28";
                break;
            default: dias = "Error";
        }
        System.out.println(dias);
    }
}
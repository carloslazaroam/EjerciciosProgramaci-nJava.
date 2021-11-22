import java.util.Scanner;
public class cj11 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número");
        int dia;
        dia = lector.nextInt();
        String diadelasemana;
        
        switch (dia) {
            case 1:
                diadelasemana = "Lunes";
                break;
            case 2: diadelasemana = "Martes";
            break;
            case 3: diadelasemana = "Miércoles";
            break;
            case 4: diadelasemana = "Jueves";
                break;
            case 5: diadelasemana = "Viernes";
            break;
            case 6: diadelasemana = "Sábado";
            break;
            case 7: diadelasemana = "Domingo";
            break;
            
            default: diadelasemana = "Error";
        }
        
        System.out.println(diadelasemana);
    }
}
import java.util.Scanner;
public class cj14{
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el número de hombres");
        int hombres;
        hombres = lector.nextInt();
        System.out.print("Introduce el número de mujeres");
        int mujeres;
        mujeres = lector.nextInt();
        int total = hombres + mujeres;
        int porcentajeh = (total - mujeres) * 100 / total;
        System.out.println("El porcentaje de los hombres es de: " +porcentajeh + "%");
        int porcentajem = (total - hombres) * 100/total;
        System.out.println("El porcentaje de las mujeres es de: " + porcentajem + "%");
        if (hombres > mujeres){
            System.out.println("Hay más hombres que mujeres");
        }
        else{
            System.out.print("Hay más mujeres que hombres");
        }
    }
}
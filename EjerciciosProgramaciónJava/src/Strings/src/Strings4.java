import java.util.Scanner;

public class Strings4 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Dame tu nombre");
        String nombre = lector.nextLine();
        System.out.println("Dime tu primer apellido");
        String apellido1 = lector.nextLine();
        System.out.println("Dime tu segundo apellido");
        String apellido2 = lector.nextLine();
        String nombrev2 = nombre.substring(0,3);
        String apellido1v2 = apellido1.substring(0,3);
        String apellido2v2 = apellido2.substring(0,3);
        String iniciales = nombrev2.concat(apellido1v2 + apellido2v2);
        System.out.println(iniciales);
        System.out.println(iniciales.toUpperCase());
    }

}

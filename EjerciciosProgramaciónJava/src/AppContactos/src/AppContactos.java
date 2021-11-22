import java.util.Scanner;
public class AppContactos {

   
    public static void main(String[] args) {
        int MAX = 100;
        Scanner lector = new Scanner(System.in);
        int[] telefono = new int[MAX];
        
        String[] nombre = new String[MAX];
        
        String[] correo = new String[MAX];
      
        int contactos = 0;
        boolean salir = false;
        
        
        do {
        System.out.println("1.Ver contactos");
        System.out.println("2.Agregar contacto");
        System.out.println("3.Eliminar contacto");
        System.out.println("4.Buscar contacto");
        System.out.println("5.Salir");
        System.out.println("Elige una opcion");
        
        int opciones = lector.nextInt();
        
        switch (opciones) {
            case 1:
                if (contactos < MAX){
                System.out.println("LISTA DE CONTACTOS");
                for(int i = 0; i < contactos; i++){
                    System.out.println((i + 1) + "Nombre: " + nombre[i] + "Telf:"  +   telefono[i] + correo[i]);
                    
                } 
                }
                else {
                    System.out.print("ERROR, El vector de notas está lleno");
                }
               
                    
                break;
            case 2:
                System.out.println("AGREGAR UN CONTACTO");
                lector.nextLine();
                System.out.println("Introduce el nombre");
                nombre[contactos] = lector.nextLine();
                
                
                System.out.println("Introduce el número de telefono");
                telefono[contactos] = lector.nextInt();
                lector.nextLine();
                System.out.println("Introduce el correo electrónico");
                correo[contactos] = lector.nextLine();
                contactos++;
                break;
                
                
                    
               
                
                
                    
                }
                
        
        }while(salir == false);
        
        
        
    }
}
    


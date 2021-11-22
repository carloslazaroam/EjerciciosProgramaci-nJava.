import java.util.Scanner;
public class CuentaBancaria {
    public static void main(String[] args) {
        int MAX = 100;
        String[] nombre = new String[MAX];
        int[] saldo = new int[MAX];
        Scanner lector = new Scanner(System.in);
        int cuentas = 0;
        int seleccion;
        int cantidad;
        int total;
        String buscar;
        boolean salir = false;
        do {
            System.out.println("1.Ver cuentas.");
            System.out.println("2.Ingresar dinero.");
            System.out.println("3.Retirar dinero.");
            System.out.println("4.Agregar cuenta.");
            System.out.println("5.Eliminar cuenta.");
            System.out.println("6.Buscar cuenta.");
            System.out.println("7.Mostrar morosos.");
            System.out.println("8.Salir");
            System.out.println("Elige una opción");
            int opciones = lector.nextInt();
            switch(opciones){
                case 1:
                    System.out.println("MOSTRANDO TODAS LAS CUENTAS");
                    if (cuentas == 0){
                        System.out.println("Aun no hay cuentas registradas");
                    }
                    else{
                        for(int i = 0; i < cuentas;i++){
                            System.out.println((i + 1) + ". " + nombre[i] + " Saldo: " + saldo[i] + "€");
                        }
                    }
                    break;
                    
                        
                    
                case 2:
                    if (cuentas == 0){
                        System.out.println("Todavía no hay cuentas registradas, introduzca al menos una cuenta para poder ingresar dinero");
                    }
                    else {
                    System.out.println("Seleccione la cuenta que desea ingresar dinero");
                     seleccion = lector.nextInt();
                    System.out.println("¿Qué cantidad desea ingresar?");
                     cantidad = lector.nextInt();
                    total = 0;
                    for(int i = seleccion + 1;i < cuentas;i++){
                        saldo[i] = saldo[i] + cantidad;
                        
                        
                    }
                    }
                    break;
                    
                case 3:
                    if (cuentas == 0){
                        System.out.println("Todavia no hay cuentas registradas, introduce al menos una cuenta para poder retirar dinero");
                    }
                    else {
                     System.out.println("Seleccione la cuenta que desea retirar dinero");
                    seleccion = lector.nextInt();
                    System.out.println("¿Qué cantidad desea retirar?");
                    cantidad = lector.nextInt();
                     total = 0;
                    for(int i = seleccion + 1;i < cuentas;i++){
                        total = saldo[i] - cantidad;
                        
                        
                    }
                    System.out.println("El saldo de la cuenta ahora es de: " + total + "€");
                    break;
                    }
                case 4:
                    System.out.println("AGREGAR CUENTA");

                    System.out.println("¿Cómo se llama el propietario?");
                    lector.nextLine();
                    nombre[cuentas] = lector.nextLine();
                    System.out.println("Introduzca el saldo de la cuenta");
                    saldo[cuentas] = lector.nextInt();
                    cuentas++;
                    break;
                            

                case 5:
                    if (cuentas == 0){
                        System.out.println("Error, no hay cuentas registradas, introduzca una cuenta primero.");
                    }
                    else {
                    System.out.println("Seleccione la cuenta que desea eliminar");
                    int borrar = lector.nextInt();
                    for (int i = borrar + 1; i < cuentas;i++){
                        nombre[i - 1] = nombre[i];
                        saldo[i - 1] = saldo[i];
                                
                    }
                    cuentas--;
                    break;
                    }
                case 6:
                    
                    lector.nextLine();
                    System.out.println("Introduzca el nombre de la cuenta");
                    buscar = lector.nextLine();
                    int contbusq = 0;
                    
                    for(int i = 0; i < cuentas;i++){
                        if(nombre[i].toLowerCase().indexOf(buscar.toLowerCase())>=0){
                            System.out.println(nombre[i] + " Saldo: " + saldo[i]);
                            contbusq++;
                            
                           
                            
                            
                            
                        }
                        
                        if (contbusq == 0){
                            System.out.println("No se ha encontrado ningún resultado");
                        }
                       
                        } 
                        
                            
                        
                  
                    
                    break;
                case 7:
                    int morosos;
                 
                    for (int i = 0; i < cuentas;i++){
                    if (saldo[i] < 0){
                        System.out.println("Los morosos son: " + nombre[i]  + " Saldo: " + saldo[i]);
                        
                    }
                    else {
                        System.out.println("No hay morosos");
                    }
                    }
                    break;
                case 8:
                    System.out.println("Has salido de la web");
                    salir = true;
                    break;
                   
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                            
            }
            
        } while (salir == false);
        
        
    }
    
}

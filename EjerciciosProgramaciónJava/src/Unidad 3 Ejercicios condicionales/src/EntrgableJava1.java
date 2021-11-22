import java.util.Scanner;
public class EntrgableJava1 {
   public static void main(String[]args){
       Scanner lector = new Scanner(System.in);
       int cont = 5;
       int factor =0;
       char letra;
       
       System.out.println("¿Tienes la presión alta?");
       
       letra = lector.nextLine().charAt(0);
       
       if (letra == 's'){
           cont +=15;
           factor +=1;
           
       }
       System.out.println("¿Tienes el colesterol elevado?");
       letra = lector.nextLine().charAt(0);
       if (letra == 's'){
           cont +=15;
           factor +=1;
       }
       System.out.println("¿Diabetes?");
       letra = lector.nextLine().charAt(0);
       if (letra == 's'){
           cont +=10;
           factor +=1;
       }
      System.out.println("¿Eres obeso?");
      letra = lector.nextLine().charAt(0);
      if (letra == 's'){
          cont += 10;
          factor +=1;
                  
      }
      System.out.println("¿Adicto al tabaco?");
      letra = lector.nextLine().charAt(0);
      if (letra == 's'){
          cont +=10;
          factor +=1;
                  
      }



















}
}
    

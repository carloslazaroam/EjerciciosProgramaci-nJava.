import java.util.Scanner;
public class BetaBucles8 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int antant = 1;
        int ant = 1;
        int actual;
        for (int N = lector.nextInt();N++){
            actual = antant + ant;
            ant = antant;
            actual = ant;
            System.out.println(actual);
        }
    }

}


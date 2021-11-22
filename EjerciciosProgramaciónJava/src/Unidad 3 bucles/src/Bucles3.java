
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a073604881m
 */
public class Bucles3 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int B = lector.nextInt();
        for (int A = lector.nextInt();A<=B;  A+=2){
            System.out.println(A);
        }
    }
    
}


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB_SW_STUDENT
 */
public class ECSIMPLE {
    public void mio() {
        Scanner or=new Scanner(System.in);
        System.out.println("Ingrese la nota del estudiante: ");
        int n=or.nextInt();
        if(n>=13){
            System.out.println("Felicidades!!!, usted paso de curso...");
        }else{
            System.out.println("Lo siento, debera llevar el curso nuevamente.");
        }        
}
    public int mio2() {
        Scanner or=new Scanner(System.in);
        System.out.println("Ingrese la nota del estudiante: ");
        int n=or.nextInt();
        if(n>=13){
            System.out.println("Felicidades!!!, usted paso de curso...");
        }else{
            System.out.println("Lo siento, debera llevar el curso nuevamente.");
        }        
        return n;
}
    
}

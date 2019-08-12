/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB_SW_STUDENT
 */
public class factorial {
    public void Factorial1(int n){
     int total=1;
     int inc=1;
        System.out.println("Factorial While");
     while(inc<=n){
         total*=inc;
         inc++;
         
     }
        System.out.println("El factorial de "+n+" es:"+total);
        }
    public  void factorial2(int numero) {
        int suma=1;
        System.out.println("Factorial For");
        for (int i = 1; i <= numero; i++) {
            suma*=i;
        }
        System.out.println("El factorial de "+numero+" es: "+suma);
    }
    
}

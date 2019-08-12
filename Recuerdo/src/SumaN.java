/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB_SW_STUDENT
 */
public class SumaN {
    public void while1(int n){
     int total=0;
     int inc=0;
     while(inc<=n){
         System.out.println("Paso "+inc+" es: "+total);
           total+=inc;
         inc++;
         
     }
        System.out.println("la Suma es:"+total);
        }
    public  void nNumer(int numero) {
        int suma=0;
        for (int i = 0; i <= numero; i++) {
            suma+=i;
        }
        System.out.println("suma es: "+suma);
    }
}

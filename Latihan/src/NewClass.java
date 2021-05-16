
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfredo Tanutama
 */
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
      Scanner k=new Scanner (System.in);
        System.out.println("Masukkan nilai x= ");  
      double x=k.nextDouble();
      double fx=Math.pow(x,2)+Math.sqrt(3*x+1);
        System.out.println(fx);
      int a=4;
       int t=3;
    
        System.out.println("Luas Segitiga: "+a*t*0.5);
  
        int d = 2;
        int e=(int) Math.pow(d,2);
        double f =Math.sqrt (3*d+1);
        double ht=e+f;
           System.out.println("nilai f(x)="+ht);

        int g=(int)Math.pow(4,3);
        System.out.println("Volume kubus= "+g);
       
                            
    }
            
}

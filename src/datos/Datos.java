/*
 * Este programa ilustra las diferencias entre
 * int y double
 */
package datos;
/**
 * @author karlosc
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            int var;
            double x;
            
            var = 10;
            x = 10.0;
            
            System.out.println("Original value of var: "+var);
            System.out.println("Original value of x: "+x);
            System.out.println();
            
            var = var/4;
            x = x/4;
            
            System.out.println("var after division: "+var);
            System.out.println("x after division: "+x);
        }
}


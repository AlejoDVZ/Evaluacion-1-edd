/*calculadora de matriz (m1+m2)*m3
    Alejandro Velasquez C.I 28.315.536
*/
package v2ejercicio1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class V2ejercicio1 {

  
    public static void main(String[] args)throws IOException {
        Scanner entrada = new Scanner(System.in);
        int x,y;
        
        System.out.println("Dime dimension de columnas"); //toma de dimensiones
        x = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de filas de la matriz "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de columnas de la matriz "));
        
        int m [][] = new int [x][y];
        
        System.out.println("Ingrese datos de matriz 1 ");//requision de valor de la matriz 1
        
           for (int j=0;j<m.length;j++){
            for (int k=0;k<m[0].length;k++){
                m[j][k]= entrada.nextInt();
            }
           }
        System.out.println("");
           System.out.println("matriz 1");//impresion matriz 1
           
           for (int j=0;j<x;j++){
            for (int k=0;k<y;k++){
                System.out.print(m[j][k]+(""));
            }
               System.out.println("");
           }
           
           System.out.println("");
         /////////////////////aqui empieza procedimiento matriz 2
         System.out.println("Ingrese datos de matriz 2 ");//requision de valor de la matriz 2
        int[][] m2 = new int [x][y];
        
           for (int j=0;j<m.length;j++){
            for (int k=0;k<m[0].length;k++){
                m2[j][k]= entrada.nextInt();
            }
           }
        System.out.println("");
           System.out.println("matriz 2");//impresion matriz 1
           
           for (int j=0;j<m.length;j++){
            for (int k=0;k<m[0].length;k++){
                System.out.print(m2[j][k]);
            }
               System.out.println("");
           }
           System.out.println("");
         /////////////////////////aqui empieza matriz 3  
        System.out.println("Ingrese datos de matriz 3 ");//requision de valor de la matriz 3
        int[][] m3 = new int [x][y];
        
           for (int j=0;j<m.length;j++){
            for (int k=0;k<m[0].length;k++){
                m3[j][k]= entrada.nextInt();
            }
           }
        System.out.println("");
           System.out.println("matriz 3");//impresion matriz 3
           
           for (int j=0;j<m.length;j++){
            for (int k=0;k<m[0].length;k++){
                System.out.print(m3[j][k]);
            }
               System.out.println("");
           }
           System.out.println("");
           //////////////////////// a partir de aqui se operaran la matrices
           
           //primero m1+m2
            
        int[][] m4 = new int [x][y];
        
           for (int j=0;j<m.length;j++){
            for (int k=0;k<m[0].length;k++){
                m4[j][k]= m[j][k]+m2[j][k];
            }
           }
        System.out.println("");
           System.out.println("matriz 4 (m1+m2)");//impresion matriz 4
           
           for (int j=0;j<m.length;j++){
            for (int k=0;k<m[0].length;k++){
                System.out.print(m4[j][k]);
            }
               System.out.println("");
           }
           System.out.println("");
           ///////////////////////////////aqui se operara la m5=m4*m3
           
           int[][] m5 = new int [x][y];
        
           for (int j=0;j<m.length;j++){
            for (int k=0;k<m[0].length;k++){
                m5[j][k]= m4[j][k]*m3[j][k];
            }
           }
        System.out.println("");
           System.out.println("matriz 5 (m1+m2)*m3");//impresion matriz 4
           
           for (int j=0;j<m.length;j++){
            for (int k=0;k<m[0].length;k++){
                System.out.print(m5[j][k]);
            }
               System.out.println("");
           }
           System.out.println("");
        
           System.out.println("Listo!");
    }//main
    
}//class

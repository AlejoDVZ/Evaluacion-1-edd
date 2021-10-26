
package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio2 {

  
    public static void main(String[] args) throws IOException {
       InputStreamReader ir = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(ir);
       Scanner sc= new Scanner(System.in);
        int x,y;
        
        System.out.println("Dime dimension de columnas");
        x = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de filas de la matriz "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de columnas de la matriz "));
        
        int matriz [][] = new int [x][y];
        
           for (int j=0;j<x;j++){
            for (int k=0;k<y;k++){
                matriz[j][k]=((23*(j^4))+(20*(k^3))-3);
            }
           }
        
           
           for (int j=0;j<x;j++){
            for (int k=0;k<y;k++){
                System.out.println(matriz[j][k]+" ");
            }
           }
         
    
   
  
            
            }//main
           }//class
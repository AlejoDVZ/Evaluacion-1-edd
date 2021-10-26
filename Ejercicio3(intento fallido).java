/*
 Comprobadora de matrices identidad 
Alejandro Velasquez C.I 28.315.536
 */
package ejercicio.pkg3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio3 {

    
    public static void main(String[] args) throws IOException{
        Scanner entrada = new Scanner(System.in);
        int x,y;
        
        System.out.println("Dime dimension de columnas"); //toma de dimensiones
        x = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de filas de la matriz "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de columnas de la matriz "));
        
        int m [][] = new int [x][y];
        
        System.out.println("Ingrese datos de matriz  ");//requision de valor de la matriz 
        
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
                                                                    //Error al generar condicional
           if(m[x][y]<&>1){
               System.out.println("No es Matriz identidad");
        
           }
           else{
               System.out.println("es Una matriz identidad");
           }
        
    }//main
    
}//class

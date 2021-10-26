
package ejercicio.pkg1.examen;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args){
        
    Scanner entrada = new Scanner(System.in);
    
    int matriz[][],x,y;
    int matriz2[][],j = 0,k = 0;
    int matriz3[][],f,c;
    //se piden las dimensiones de la matriz
        System.out.println("Dame el numero de filas de la primera matriz");
        x = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de filas de la matriz 1"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Dame las columnas de la matriz 1"));
        
        System.out.println("Ahora dime los valores de la matriz 1"); //se ingresan los datos de la matiz
        
        matriz = new int [x][y];
        
        for (int a = 0;a < x ;a++){
            for (int z = 0; z <y;z++ ){
                matriz[a][z]= entrada.nextInt();
            }
        }
        
        System.out.println("Matriz 1"); //se imprime la matriz
        
        for (int a = 0;a<x;a++){
            for (int z = 0; z <y;z++ ){
                System.out.print(matriz[a][z]);
                                      }
            System.out.println("");
                                }
        
        
//aqui acaba la declaracion de la primera matrizzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
        
        
//aqui empieza la declaracion de la segunda matriz
        
          
        System.out.println("dime los valores de la matriz 2");
        //se ingresan los datos de la matiz
        
        matriz2 = new int [j][k];
        j = x;
        k = y;
        
        for (int a = 0;a<j;a++){
            for (int z = 0; z <k;z++ ){
                matriz2[a][z]= entrada.nextInt();
            }
        }
        
        System.out.println("Matriz 2"); //se imprime la matriz 2
        
        for (int a = 0;a<j;a++){
            for (int z = 0; z <k;z++ ){
                System.out.print(matriz2[a][z]);
                                      }
            System.out.println("");
                                }
        
        
        //aqui acaba la declaracion de la segunda matrizzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
        
        f = x;
        c = y;
       
        System.out.println("Dime los valores de la matriz 3"); //se ingresan los datos de la matiz 3
        
        matriz3 = new int [f][c];
        
        for (int a = 0;a<f;a++){
            for (int z = 0; z <x;z++ ){
                matriz3[a][z]= entrada.nextInt();
            }
        }
        
        System.out.println("Matriz 3"); //se imprime la matriz 3
        
        for (int a = 0;a<f;a++){
            for (int z = 0; z <c;z++ ){
                System.out.print(matriz3[a][z]);
                                      }
            System.out.println("");
                                }
        
        //aqui acaba la declaracion de la tercera matrizzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
        
        
        //Ahora a sumar la matriz 1 y 2
        
        System.out.println("ahora se sumara la matriz 1 + la 2");
        
        int[][] matriz4 = new int[matriz.length][matriz[0].length];
        
        for (int a=0; a < matriz.length; a++)  {
            for (int z=0; z < matriz[x].length; z++) {
                
                matriz4[x][y]=matriz2[j][k]+matriz[x][y];
            }   
        }
        
        System.out.println("Matriz 4 (m1+m2)"); //se imprime la matriz 4
        
        for (int a = 0;a<f;a++){
            for (int z = 0; z <c;z++ ){
                System.out.print(matriz4[a][z]);
                                      }
            System.out.println("");
                                }
        
        
        //aqui acaba la 4ta matrizzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
        
        System.out.println("ahora calcularemos la matriz 5 ((m1+m2*)m3)");

        
        int[][] matriz5 = new int[matriz.length][matriz[0].length];
        
        for (int a=0; a < matriz.length; a++)  {
            for (int z=0; z < matriz[x].length; z++) {
                
                matriz5[x][y]=matriz4[x][y]*matriz3[f][c];
            }   
        }
        
        {System.out.println("Matriz 5 (m1+m2)*m3"); //se imprime la matriz 5
        
        for (int a = 0;a<f;a++){
            for (int z = 0; z <c;z++ ){
                System.out.print(matriz5[a][z]);
                                      }
            System.out.println("");
                                }
        }
        
        System.out.println("listo!");
        
        
    }
}
    
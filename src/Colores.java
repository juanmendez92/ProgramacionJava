/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class Colores {
    public static void main(String[] args) {
        String Green = "\u001B[42m";
        String Defauld = "\u001B[0m";
        
        int filas = 9;
        int columnas = 9;
        
        int buscaminas[][] = new int[filas][columnas];
        
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                if (buscaminas[i][j] == -1) {
                    System.out.print(Green + buscaminas[i][j] + Defauld + "\t");
                } else {
                    System.out.print(buscaminas[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}

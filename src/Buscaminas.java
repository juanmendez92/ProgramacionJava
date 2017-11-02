
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class Buscaminas {
    public static void main(String[] args) {
        int filas = 16;
        int columnas = 16;
        int minas = 40;
        
        int buscaminas[][] = new int[filas][columnas];
        Random r = new Random();
        
        while(minas > 0) {
            int x = r.nextInt(filas);
            int y = r.nextInt(columnas);
            
            if (buscaminas[x][y] != -1) {
                buscaminas[x][y] = -1;
                minas--;
            }
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k >= 0 && l >= 0 && k < filas && l < columnas) {
                            if (buscaminas[k][l] == -1 && buscaminas[i][j] != -1) {
                                buscaminas[i][j]++;
                            }
                        }
                    }
                }
            }
        }
        
        String Green = "\u001B[42m";
        String Defauld = "\u001B[0m";
        
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.Scanner;

/**
 *
 * @author KANG_SNAKE
 */
public class Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              int[]data=new int[]{92,98,76,72,84,101,39};
        Scanner input=new Scanner(System.in);
        
        System.out.println("Data array:");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+"\t");
        }
        
        System.out.println("\nNilai kelipatan 3: ");
        for(int j=0; j <data.length; j++){
            if(data[j]%3 == 0){
                System.out.println(data[j]);
            }
        }
     }
}

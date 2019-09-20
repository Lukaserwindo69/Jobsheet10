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
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              int cari;
        boolean found=false;
        int[]data=new int[]{8,90,56,90,6969,76,42};
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan data yang dicari");
        cari=input.nextInt();
        for(int i=0;i<data.length;i++){
        if(cari==data[i]){
          found=true;
          System.out.println("Data yang ditemukan pada indeks ke-"+i);
        }
    }
    }

    }
    
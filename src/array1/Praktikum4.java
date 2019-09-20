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
public class Praktikum4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner input =new Scanner(System.in);
        String cari;
        int jumlah;
        System.out.print("Masukkan kata/kalimat: ");
        cari= input.nextLine();
        
        int a=0;
        for(int i=0;i<cari.length();i++){
            if(cari.charAt(i)=='a'){
                a++;
            }
        }
        System.out.println("Jumlah huruf a = "+a);
        
        
        int i=0;
        for(int z=0;z<cari.length();z++){
            if(cari.charAt(z)=='i'){
                i++;
            }
        }
        System.out.println("Jumlah huruf i = "+i);
        
        int u=0;
        for(int z=0;z<cari.length();z++){
            if(cari.charAt(z)=='u'){
                u++;
            }
        }
        System.out.println("Jumlah huruf u = "+u);
        
        int e=0;
        for(int z=0;z<cari.length();z++){
            if(cari.charAt(z)=='e'){
                e++;
            }
        }
        System.out.println("Jumlah huruf e = "+e);
        
        int o=0;
        for(int z=0;z<cari.length();z++){
            if(cari.charAt(z)=='o'){
                o++;
            }
        }
        System.out.println("Jumlah huruf o = "+o);
        jumlah=a+i+u+e+o;
        System.out.println("Jumlah semua huruf vokal = "+jumlah);
        
    }
    
    
}

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
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String find;
        boolean found = false;
        String[] hewan = new String[]{"ULAR","NAGA","KADAL","BUAYA","KALAJENGKING"};
        Scanner erere = new Scanner(System.in);
        System.out.println("MASUKAN NAMA HEWAN: ");
        find = erere.nextLine();
        for (int i=0; i<hewan.length; i++){
            if(find.equalsIgnoreCase(hewan[i])){
                found=true;
                break;
            }
        }
        if(found==true){
            System.out.println("DITEMUKAN");
        }else{
            System.out.println("TYDACK DITEMUKAN.");
        }
                }
    

    }
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;
import java.util.Scanner;
/**
 *
 * @author Yousef Ehab
 */
 class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      System.out.println("enter num :");
      
       int num = in.nextInt();
       
       if(num>10){
           System.out.println("yes");
       }else{
           System.out.println("No");
       }
    }
}

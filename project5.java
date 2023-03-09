package com.mycompany.javatest2;


  
import java.util.Scanner;
//my name youssef ehab

 class my{

public static void main(string[] args) {
  Scanner in =  new Scanner (System.in);
  System.out.println( "enter num :");
   
  int a ,b ,c ;
  a = in.nextInt();
  b = in.nextInt();
  c = in.nextInt();
  if(a>b && a>c){
    System.out.println("largest number a = "+a);
  }else if(b>a && b>c){
    System.out.println("largest number b = "+b );
  }else if(c>a && c>b){
    System.out.println("largest number c = "+c);
  }else {
    System.out.println("the number are same");
  }



    }
}



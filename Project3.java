
package com.mycompany.project3;
import java.util.Scanner;
public class Project3 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=0;
        System.out.println("Enter Number");
        num =in.nextInt();
        if(num > 0)
            num-=5;
        else{
            num+=5;
        }
        System.out.println("Resault is "+ num);
    }
}

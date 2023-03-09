
package com.mycompany.project4;
import java.util.Scanner;
public class Project4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,multi;
        n =in.nextInt();
        for (int counter = 0; counter <= n; counter++) {
            multi =counter*counter;
            System.out.println(multi);
        }
    }
}

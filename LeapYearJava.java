/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear.java;

import java.util.Scanner;
public class LeapYearJava {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int year;
        System.out.println("enter a year value: ");
        year = in.nextInt();
        boolean isleapyear=(year%4 == 0&&year%100!= 0) || (year%400 == 0);
        System.out.printf("is %d a leap year?%b%n ",year,isleapyear );
    }
    
}

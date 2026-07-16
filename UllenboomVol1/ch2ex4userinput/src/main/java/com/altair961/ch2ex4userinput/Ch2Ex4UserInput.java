/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altair961.ch2ex4userinput;

import java.util.Locale;

/**
 *
 * @author ubuntu
 */
public class Ch2Ex4UserInput {
    public static void main(String[] args) {
        int max = 20;
        int min = 10;
        System.out.print("Provide x: ");
        int x = new java.util.Scanner(System.in).nextInt(); // e.g.:100
        System.out.print("Provide y: ");
        int y = new java.util.Scanner(System.in).nextInt(); // e.g.:110
        double r = Math.random() * (max - min) + min;
        System.out.printf(Locale.ENGLISH,
        "<svg height=\"400\" width=\"1000\">\n "
        + "<circle cx=\"%d\" cy=\"%d\" r=\"%.2f\" />\n</svg>\n%n",
        x, y, r );
    }
}

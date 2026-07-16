/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altair961.ch2ex3;

/**
 *
 * @author ubuntu
 */
public class SvgCircle1 {
    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        double rnd = Math.random() * (max - min) + min;
        int x = 100;
        int y = 110;
        System.out.println("<svg height=\"400\" width=\"1000\">");
        System.out.println("\t<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + rnd + "\" />");
        System.out.println("</svg>");
    }
}
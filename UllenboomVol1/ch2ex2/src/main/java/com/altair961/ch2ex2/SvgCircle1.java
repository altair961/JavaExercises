/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altair961.ch2ex2;

import java.math.BigDecimal;

/**
 *
 * @author ubuntu
 */
public class SvgCircle1 {
    public static void main(String[] args) {
        int x = 100;
        int y = 110;
        double r = 20.5;
        System.out.println("<svg height=\"400\" width=\"1000\">");
        System.out.println("\t<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" />");
        System.out.println("</svg>");
    }
}


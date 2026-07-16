/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altair961.ch2ex5lootsharing;

/**
 *
 * @author ubuntu
 */
public class Ch2Ex5LootSharing {

    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Number of bottles in total?: ");
        int bottles = scanner.nextInt();
        System.out.println("Bottles: " + bottles);
        int captainsBottles = bottles / 2;
        System.out.println("Bottles for the captain: " + captainsBottles);
        int crewsBottles = bottles - captainsBottles;
        System.out.println("Bottles for all crew members: " + crewsBottles);
        System.out.println("Number of crew members?: ");
        int crewMembers = scanner.nextInt();

        System.out.println("Fair share without remainder?: " + (crewsBottles % crewMembers == 0));
    }
}

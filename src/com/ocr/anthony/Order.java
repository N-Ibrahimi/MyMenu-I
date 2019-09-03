package com.ocr.anthony;

import java.net.SocketTimeoutException;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("liste de choix");
        System.out.println("1- le poisson");
        System.out.println("2- végétran");
        System.out.println("3- la salade ");
        System.out.println("choisissez votre command svp!");

    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        System.out.println("Vous avez choisi le menu "+ nbMenu);
    }
}
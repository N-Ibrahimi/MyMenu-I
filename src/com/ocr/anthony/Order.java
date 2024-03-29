package com.ocr.anthony;

import java.net.SocketTimeoutException;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("liste de choix");
        System.out.println("1- poulet");
        System.out.println("2- boeuf");
        System.out.println("3- végétarien");
        System.out.println("choisissez votre command svp!");

    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        if(nbMenu==1){
            System.out.println("Vous avez choisi comme menu : poulet");
        } else if(nbMenu==2){
            System.out.println("Vous avez choisi comme menu : boeuf");
        } else if(nbMenu==3){
            System.out.println("Vous avez choisi comme menu : végétarien");
        } else{
            System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
        }
    }
}
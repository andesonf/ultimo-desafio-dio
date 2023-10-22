/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.user;

/**
 *
 * @author felis
 */
public class User {

    public static void main(String[] args) {
        // Classe Account
public class Account {
    private String number;
    private String agency;
    private double balance;
    private double limit;

    public Account(String number, String agency, double balance, double limit) {
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.limit = limit;
    }

    // Métodos getters e setters
}
// Classe Feature
public class Feature {
    private String icon;
    private String description;

    public Feature(String icon, String description) {
        this.icon = icon;
        this.description = description;
    }

    // Métodos getters e setters
}
// Classe Card
public class Card {
    private String number;
    private double limit;

    public Card(String number, double limit) {
        this.number = number;
        this.limit = limit;
    }

    // Métodos getters e setters
}
// Classe News
public class News {
    private String icon;
    private String description;

    public News(String icon, String description) {
        this.icon = icon;
        this.description = description;
    }

    // Métodos getters e setters
}
// Classe principal para testar as classes
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes
        Account myAccount = new Account("123456", "789", 1000.0, 500.0);
        Feature myFeature = new Feature("star", "Rewards Program");
        Card myCard = new Card("987654321", 1000.0);
        News myNews = new News("news", "New Feature Released");
        // Imprimir informações para verificar se as classes estão funcionando corretamente
        System.out.println("Account Number: " + myAccount.getNumber());
        System.out.println("Card Number: " + myCard.getNumber());
        System.out.println("Feature Description: " + myFeature.getDescription());
        System.out.println("News Icon: " + myNews.getIcon());
    }
}
    }
}

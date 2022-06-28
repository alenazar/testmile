package com.company;

public class Main {

    public static void main(String[] args) {

        int ticketPrice = 110; // стоимость билета
        int bonusMile = 20; // количество рублей на одну бонусную милю
        int numberBonusMiles = (ticketPrice / bonusMile); // количество бонусных миль за один билет

        System.out.println("количество бонусных миль за один билет: " + numberBonusMiles);
    }
}

package com.company;

public class BonusMilesService {

    public int calculate(int cost) {

        int bonusMile = 20; // количество рублей на одну бонусную милю
        int numberBonusMiles = (cost / bonusMile); // количество бонусных миль за один билет
        return numberBonusMiles;

    }

}

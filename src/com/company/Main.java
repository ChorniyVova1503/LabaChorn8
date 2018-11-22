package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Drug drug= new Drug();
        drug.setManufacturingCompany("Company");
        drug.setNameOfTheDrug("paracetamol");

        Drug drug1=new Drug();
        drug1.setManufacturingCompany("Aurora");
        drug1.setNameOfTheDrug("paracetamol");

        DataBase dataBase=new DataBase();
        dataBase.add(drug);
        dataBase.add(drug1);

        dataBase.printData();

    }
}

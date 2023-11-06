package com.company;
import com.company.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Cati angajati?");
        int numarAngajati = myObj.nextInt();
        ArrayList<Employee> angajati = new ArrayList<Employee>();
        for(int i = 0; i < numarAngajati; i++){
            Employee angajat = new Employee();
            System.out.println("Nume angajat " + i+1 + ":");
            String name = myObj.nextLine();
            angajat.setName(name);
            System.out.println("Email angajat " + i+1 + ":");
            String email = myObj.nextLine();
            angajat.setEmail(email);
            System.out.println("Plata pe ora angajat " + i+1 + ":");
            double hourRate = myObj.nextDouble();
            angajat.setHourRate(hourRate);
            angajati.add(i, angajat);
        }

    }
}

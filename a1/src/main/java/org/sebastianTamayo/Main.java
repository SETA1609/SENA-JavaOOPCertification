package org.sebastianTamayo;

import org.sebastianTamayo.controller.BankingApp;
import org.sebastianTamayo.controller.BankingAppInterface;

public class Main {
    public static void main(String[] args) {
        BankingAppInterface bankingAppInterface= new BankingApp();

        bankingAppInterface.run();
    }
}
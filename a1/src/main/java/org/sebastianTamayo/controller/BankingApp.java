package org.sebastianTamayo.controller;

public class BankingApp implements BankingAppInterface{

    private boolean isRunning;

    public BankingApp() {
        setRunning(true);
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        do {



        }while (isRunning);
    }

    @Override
    public void stop() {
        setRunning(false);
    }


}

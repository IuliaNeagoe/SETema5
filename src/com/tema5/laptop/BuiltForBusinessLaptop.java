package com.tema5.laptop;

import com.tema5.interfaces.ILaptop;

/**
 * Created by IuliS on 14.11.2014.
 */
public class BuiltForBusinessLaptop implements ILaptop {

    //members
    private double diagonalScreen;
    private int ram;
    private String processor;
    private boolean fingerprint;

    //basic constructor
    public BuiltForBusinessLaptop() {
        this.diagonalScreen=13.3;
        this.fingerprint=false;
        this.ram=3;
        this.processor="Intel";
    }

    //custom constructor
    public BuiltForBusinessLaptop(double diagonalScreen, int ram, String processor, boolean fingerprint) {
        this.diagonalScreen = diagonalScreen;
        this.ram = ram;
        this.processor = processor;
        this.fingerprint = fingerprint;
    }

    //method that verifies if the laptop given as parameter has fingerprint

    public void hasFingerprint(BuiltForBusinessLaptop object)
    {
        if(object.isFingerprint())
            System.out.println("This laptop has fingerprint!\n");
        else
            System.out.println("This laptop has not fingerprint!\n");
    }

    /**
     * implements the method 'use()' from the interface with specific characteristics
     */
    @Override
    public void use() {
        System.out.println("You are currently using the 'Built For Bussiness Laptop' ! Welcome!\n");
    }

    /**
     * get and set for all the members
     * @return
     */


    public double getDiagonalScreen() {
        return diagonalScreen;
    }

    public void setDiagonalScreen(double diagonalScreen) {
        this.diagonalScreen = diagonalScreen;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public boolean isFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(boolean fingerprint) {
        this.fingerprint = fingerprint;
    }
}

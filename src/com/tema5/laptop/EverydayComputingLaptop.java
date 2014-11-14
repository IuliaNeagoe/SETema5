package com.tema5.laptop;

import com.tema5.interfaces.ILaptop;

/**
 * Created by IuliS on 14.11.2014.
 */
public class EverydayComputingLaptop implements ILaptop{

    /**
     * members
     */
    private double diagonalScreen;
    private int ram;
    private String processor;
    private int hard;
    private boolean dvdBurner;

    //basic constructor
    public EverydayComputingLaptop() {
        this.diagonalScreen = 15.6;
        this.ram = 2;
        this.processor = "AMD";
        this.hard = 1;
        this.dvdBurner = false;
    }

    //custom constructor

    public EverydayComputingLaptop(double diagonalScreen, int ram, String processor, int hard, boolean dvdBurner) {
        this.diagonalScreen = diagonalScreen;
        this.ram = ram;
        this.processor = processor;
        this.hard = hard;
        this.dvdBurner = dvdBurner;
    }

    /**
     * implements the method 'use()' from the interface with specific characteristics
     */
    @Override
    public void use() {
        System.out.println("You are currently using the 'Everyday Computing Laptop' ! Welcome!\n");
    }

    /**
     * verifies if the laptop is truly this type
     */

    public boolean isTrulyEverydayComputing()
    {
        if(this.hasDvdBurner())
            return true;
        else return false;
    }
    /**
     * getters and setters for all the members
     *
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

    public int getHard() {
        return hard;
    }

    public void setHard(int hard) {
        this.hard = hard;
    }

    public boolean hasDvdBurner() {
        return dvdBurner;
    }

    public void setDvdBurner(boolean dvdBurner) {
        this.dvdBurner = dvdBurner;
    }
}

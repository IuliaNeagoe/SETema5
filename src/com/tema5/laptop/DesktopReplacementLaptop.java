package com.tema5.laptop;

import com.tema5.interfaces.ILaptop;

/**
 * Created by IuliS on 14.11.2014.
 */
public class DesktopReplacementLaptop implements ILaptop{

    /**
     * specific members
     */
    private double diagonalScreen;
    private int ram;
    private String processor;
    private int hard;
    private boolean dedicatedGraphics;

    /**
     * basic constructor
     */
    public DesktopReplacementLaptop() {
        this.diagonalScreen = 17.3;
        this.ram = 4;
        this.processor = "AMD";
        this.hard = 7200;
        this.dedicatedGraphics = true;
    }

    //custom constructor
    public DesktopReplacementLaptop(double diagonalScreen, int ram, String processor, int hard, boolean dedicatedGraphics) {
        this.diagonalScreen = diagonalScreen;
        this.ram = ram;
        this.processor = processor;
        this.hard = hard;
        this.dedicatedGraphics = dedicatedGraphics;
    }

    /**
     * implements the method 'use()' from the interface with specific characteristics
     */
    @Override
    public void use() {
        System.out.println("You are currently using the 'Desktop Replacement Laptop' ! Welcome!\n");
    }

    /**
     * get and set for all the members
     * @return
     */

    public boolean isTrulyADesktopReplacement()
    {
        if(this.dedicatedGraphics ==true && this.hard == 1 && this.diagonalScreen == 17.3 && this.ram == 8 )
            return true;
        else
            return false;
    }
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

    //verifies if the laptop has dedicated graphics or not
    public boolean hasDedicatedGraphics() {
        return dedicatedGraphics;
    }

    public void setDedicatedGraphics(boolean dedicatedGraphics) {
        this.dedicatedGraphics = dedicatedGraphics;
    }
}

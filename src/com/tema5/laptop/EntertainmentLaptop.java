package com.tema5.laptop;

import com.tema5.interfaces.ILaptop;

/**
 * Created by IuliS on 14.11.2014.
 */
public class EntertainmentLaptop implements ILaptop {

    /**
     * members
     */
    private double diagonalScreen;
    private int ram;
    private String processor;
    private int hard;
    private boolean bluRay;
    private boolean stereoSpeakers;

    //basic constructor
    public EntertainmentLaptop() {
        this.diagonalScreen = 13.3;
        this.ram = 4;
        this.processor = "Intel";
        this.hard = 500;
        this.bluRay = false;
        this.stereoSpeakers = false;
    }
    //custom constructor
    public EntertainmentLaptop(double diagonalScreen, int ram, String processor, int hard, boolean bluRay, boolean stereoSpeakers) {
        this.diagonalScreen = diagonalScreen;
        this.ram = ram;
        this.processor = processor;
        this.hard = hard;
        this.bluRay = bluRay;
        this.stereoSpeakers = stereoSpeakers;
    }

    /**
     * implements the method 'use()' from the interface with specific characteristics
     */
    @Override
    public void use() {
        System.out.println("You are currently using the 'Entertainment Laptop' ! Welcome!\n");
    }

    /**
     * verifies if the laptop is truly Entertainment type
     */

    public boolean isTrulyEntertainment()
    {
        if(this.hasBluRay() && this.hasStereoSpeakers())
            return true;
        else
            return false;
    }

    /**
     * getters and setters for all the members of the class
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
    //verifies if the laptop is BluRay
    public boolean hasBluRay() {
        return bluRay;
    }

    public void setBluRay(boolean bluRay) {
        this.bluRay = bluRay;
    }
    //verifies if the laptop has stereo speakers
    public boolean hasStereoSpeakers() {
        return stereoSpeakers;
    }

    public void setStereoSpeakers(boolean stereoSpeakers) {
        this.stereoSpeakers = stereoSpeakers;
    }
}

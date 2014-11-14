package com.tema5.laptop;

import com.tema5.interfaces.ILaptop;

/**
 * Created by IuliS on 14.11.2014.
 */
public class LightweightLaptop implements ILaptop{

    //members
    private double diagonalScreen;
    private int ram;
    private String processor;
    private int hard;
    private boolean sharedVideoMemory;
    private boolean opticalDrive;

    /**
     * basic constructor
     */
    public LightweightLaptop() {
        this.diagonalScreen = 13.3;
        this.ram = 6;
        this.processor = "Dual core";
        this.hard = 128;
        this.sharedVideoMemory = true;
        this.opticalDrive = true;
    }

    /**
     * custom constructor
     * @param diagonalScreen
     * @param ram
     * @param processor
     * @param hard
     * @param sharedVideoMemory
     * @param opticalDrive
     */
    public LightweightLaptop(double diagonalScreen, int ram, String processor, int hard, boolean sharedVideoMemory, boolean opticalDrive) {
        this.diagonalScreen = diagonalScreen;
        this.ram = ram;
        this.processor = processor;
        this.hard = hard;
        this.sharedVideoMemory = sharedVideoMemory;
        this.opticalDrive = opticalDrive;
    }

    /**
     * implements the method 'use()' from the interface with specific characteristics
     */
    @Override
    public void use() {
        System.out.println("You are currently using the 'Lightweight Laptop' ! Welcome!\n");

    }

    //verifies if the laptop is truly Lightweight
    public boolean isTrulyLightweight()
    {
        if (this.hasOpticalDrive() && this.hasSharedVideoMemory())
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
    //verifies if the laptop shared video memory
    public boolean hasSharedVideoMemory() {
        return sharedVideoMemory;
    }

    public void setSharedVideoMemory(boolean sharedVideoMemory) {
        this.sharedVideoMemory = sharedVideoMemory;
    }
    //verifies if the laptop has optical drive
    public boolean hasOpticalDrive() {
        return opticalDrive;
    }

    public void setOpticalDrive(boolean opticalDrive) {
        this.opticalDrive = opticalDrive;
    }
}

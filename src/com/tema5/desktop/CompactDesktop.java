package com.tema5.desktop;

import com.tema5.interfaces.IDesktop;

/**
 * Created by IuliS on 14.11.2014.
 */
public class CompactDesktop implements IDesktop {

    private boolean isSmall;
    private boolean similarLaptop;

    //basic constructor


    public CompactDesktop() {
        this.isSmall = true;
        this.similarLaptop = true;
    }

    //custom constructor

    public CompactDesktop(boolean isSmall, boolean similarLaptop) {
        this.isSmall = isSmall;
        this.similarLaptop = similarLaptop;
    }

    /**
     * implements the method 'turnOn()' from the interface with specific characteristics
     */
    @Override
    public void turnOn() {
        System.out.println("You turned on the 'Compact Desktop!' Welcome!\n");
    }


    //is truly compact
    public boolean isTrulyCompact()
    {
        if(this.isSmall() && this.isSimilarLaptop())
            return true;
        else
            return false;
    }

    /**
     * Getters and setters
     */

    public boolean isSmall() {
        return isSmall;
    }

    public void setSmall(boolean isSmall) {
        this.isSmall = isSmall;
    }

    public boolean isSimilarLaptop() {
        return similarLaptop;
    }

    public void setSimilarLaptop(boolean similarLaptop) {
        this.similarLaptop = similarLaptop;
    }
}

package com.tema5.desktop;

import com.tema5.interfaces.IDesktop;

/**
 * Created by IuliS on 14.11.2014.
 */
public class FullSizedDesktop implements IDesktop {

    private boolean classic;
    private boolean separateCase;
    //basic constructor


    public FullSizedDesktop() {
        this.separateCase = true;
        this.classic = true;
    }

    //custom constructor

    public FullSizedDesktop(boolean separateCase, boolean classic) {
        this.separateCase = separateCase;
        this.classic = classic;
    }

      //verify truly Full size

    public boolean isTrulyFullSize()
    {
        if(this.isClassic() && this.isSeparateCase())
            return true;
        else return false;
    }
    /**
     * implements the method 'turnOn()' from the interface with specific characteristics
     */
    @Override
    public void turnOn() {
        System.out.println("You turned on the 'Full Sized Desktop!' Welcome!\n");
    }
    /**
     * Getters and setters
     */

    public boolean isClassic() {
        return classic;
    }

    public void setClassic(boolean classic) {
        this.classic = classic;
    }

    public boolean isSeparateCase() {
        return separateCase;
    }

    public void setSeparateCase(boolean separateCase) {
        this.separateCase = separateCase;
    }
}

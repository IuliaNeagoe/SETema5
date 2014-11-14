package com.tema5.desktop;

import com.tema5.interfaces.IDesktop;

/**
 * Created by IuliS on 14.11.2014.
 */
public class AllInOneDesktop implements IDesktop {

    //members
    private boolean speakersIn;
    private boolean cameraIn;
    private boolean micIn;

    // basic constructor

    public AllInOneDesktop() {
        this.speakersIn = true;
        this.cameraIn = true;
        this.micIn = true;
    }

    //custom constructor

    public AllInOneDesktop(boolean speakersIn, boolean cameraIn, boolean micIn) {
        this.speakersIn = speakersIn;
        this.cameraIn = cameraIn;
        this.micIn = micIn;
    }


    /**
     * implements the method 'turnOn()' from the interface with specific characteristics
     */
    @Override
    public void turnOn() {
        System.out.println("You turned on the 'All-In-One Desktop!' Welcome!\n");
    }

    /**
     * verify if the desktop is truly all in
     */

    public boolean isTrulyAllIn()
    {
        if(this.isCameraIn() && this.isMicIn() && this.isSpeakersIn())
            return true;
        else return false;
    }

    /**
     * Getters and setters
     * getters-verify if the peripherals are integrated or not
     */
    public boolean isSpeakersIn() {
        return speakersIn;
    }

    public void setSpeakersIn(boolean speakersIn) {
        this.speakersIn = speakersIn;
    }

    public boolean isCameraIn() {
        return cameraIn;
    }

    public void setCameraIn(boolean cameraIn) {
        this.cameraIn = cameraIn;
    }

    public boolean isMicIn() {
        return micIn;
    }

    public void setMicIn(boolean micIn) {
        this.micIn = micIn;
    }
}

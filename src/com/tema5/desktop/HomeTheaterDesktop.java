package com.tema5.desktop;

import com.tema5.interfaces.IDesktop;

/**
 * Created by IuliS on 14.11.2014.
 */
public class HomeTheaterDesktop implements IDesktop {

    private boolean linked;
    private boolean videoGraphics;
    private boolean tvTunner;

    public HomeTheaterDesktop() {
        this.linked = true;
        this.videoGraphics = true;
        this.tvTunner = true;
    }

    public HomeTheaterDesktop(boolean linked, boolean videoGraphics, boolean tvTunner) {
        this.linked = linked;
        this.videoGraphics = videoGraphics;
        this.tvTunner = tvTunner;
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
    public boolean isLinked() {
        return linked;
    }

    public void setLinked(boolean linked) {
        this.linked = linked;
    }

    public boolean isVideoGraphics() {
        return videoGraphics;
    }

    public void setVideoGraphics(boolean videoGraphics) {
        this.videoGraphics = videoGraphics;
    }

    public boolean isTvTunner() {
        return tvTunner;
    }

    public void setTvTunner(boolean tvTunner) {
        this.tvTunner = tvTunner;
    }
}

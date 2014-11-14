package com.tema5.factory;

import com.tema5.abstracts.DeviceFactory;
import com.tema5.interfaces.IDesktop;
import com.tema5.interfaces.ILaptop;
import com.tema5.laptop.*;

/**
 * Created by IuliS on 14.11.2014.
 */
public class LaptopFactory extends DeviceFactory {
    @Override
    public IDesktop produceDesktop(String desktop) {

        return null;
    }

    @Override
    public ILaptop produceLaptop(String laptop) {
        if(laptop == null)
            return null;
        if(laptop.equalsIgnoreCase("BUILTFORBUSINESS"))
            return new BuiltForBusinessLaptop();
        else if(laptop.equalsIgnoreCase("DESKTOPREPLACEMENT"))
            return new DesktopReplacementLaptop();
        else if(laptop.equalsIgnoreCase("ENTERTAINMENT"))
            return new EntertainmentLaptop();
        else if(laptop.equalsIgnoreCase("EVERYDAYCOMPUTING"))
            return new EverydayComputingLaptop();
        else if(laptop.equalsIgnoreCase("LIGHTWEIGHT"))
            return new LightweightLaptop();
        return null;
    }
}

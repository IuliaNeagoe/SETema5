package com.tema5.factory;

import com.tema5.abstracts.DeviceFactory;
import com.tema5.desktop.*;
import com.tema5.interfaces.IDesktop;
import com.tema5.interfaces.ILaptop;

/**
 * Created by IuliS on 14.11.2014.
 */
public class DesktopFactory extends DeviceFactory {

    @Override
    public IDesktop produceDesktop(String desktop) {
        if(desktop == null)
            return null;
        if(desktop.equalsIgnoreCase("ALLINONE"))
            return new AllInOneDesktop();
        else if(desktop.equalsIgnoreCase("COMPACT"))
            return new CompactDesktop();
        else if(desktop.equalsIgnoreCase("FULLSIZED"))
            return new FullSizedDesktop();
        else if(desktop.equalsIgnoreCase("HOMETHEATER"))
            return new HomeTheaterDesktop();
        return null;
    }

    @Override
    public ILaptop produceLaptop(String laptop) {
        return null;
    }

}

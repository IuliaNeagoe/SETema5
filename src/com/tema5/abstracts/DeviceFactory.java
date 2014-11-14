package com.tema5.abstracts;

import com.tema5.interfaces.IDesktop;
import com.tema5.interfaces.ILaptop;

/**
 * Created by IuliS on 14.11.2014.
 */
public abstract class DeviceFactory {
    public abstract IDesktop produceDesktop(String desktop);
    public abstract ILaptop produceLaptop(String laptop);
}

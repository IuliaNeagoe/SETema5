package com.tema5.producer;

import com.tema5.abstracts.DeviceFactory;
import com.tema5.factory.DesktopFactory;
import com.tema5.factory.LaptopFactory;

/**
 * Created by IuliS on 14.11.2014.
 */
public class FactoryProducer {
    public static DeviceFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("DESKTOP")){
            return new DesktopFactory();
        } else if(choice.equalsIgnoreCase("LAPTOP")){
            return new LaptopFactory();
        }
        return null;
    }
}

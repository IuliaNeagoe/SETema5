package com.tema5;

import com.tema5.abstracts.DeviceFactory;
import com.tema5.interfaces.IDesktop;
import com.tema5.interfaces.ILaptop;
import com.tema5.laptop.LightweightLaptop;
import com.tema5.producer.FactoryProducer;

/**
 * Created by IuliS on 14.11.2014.
 */
public class Main {
    public static void main(String[] args)
    {
        // get desktop factory
        DeviceFactory desktopFactory= FactoryProducer.getFactory("desktop");

        //get an object
        IDesktop compact=desktopFactory.produceDesktop("compact");

        //call turn on method of desktop
        compact.turnOn();

        //get another object
        IDesktop hometheater=desktopFactory.produceDesktop("hometheatre");

        //call turn on method of desktop
        hometheater.turnOn();

        //get laptop factory
        DeviceFactory laptopFactory = FactoryProducer.getFactory("laptop");

        //get an lightweight laptop object
        ILaptop lightweight = laptopFactory.produceLaptop("lightweight");

        //verify if this laptop is truly a Lightweight one
        if(((LightweightLaptop)lightweight).isTrulyLightweight())
            System.out.println("This laptop is truly Lightweight! \n");
        else
            System.out.println("This laptop is not a Lightweight! \n");

        //call use method of lightweight object
        lightweight.use();

    }
}

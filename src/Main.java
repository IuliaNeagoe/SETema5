import com.tema5.abstracts.DeviceFactory;
import com.tema5.interfaces.IDesktop;
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
        IDesktop hometh=desktopFactory.produceDesktop("hometheatre");

        
    }
}

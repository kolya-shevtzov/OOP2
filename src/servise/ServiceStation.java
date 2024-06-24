package servise;

import model.Bicycle;
import model.Car;
import model.Transport;
import model.Truck;

public class ServiceStation {
    public void check(Transport transport){
        System.out.printf("обслуживается %s%n", transport.getModelName());
        transport.servise();
    }
}

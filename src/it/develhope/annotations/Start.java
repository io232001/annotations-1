package it.develhope.annotations;

public class Start {

    
    public static void main(String args[])
    {
        @SuppressWarnings("deprecation")
        Car car = new Car("Fiat", 456);
        car.printCarDetails();  // Suppressing deprecation warning
        car.getCarDetails();
        
    }

}

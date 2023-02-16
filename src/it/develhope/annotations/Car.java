package it.develhope.annotations;
public class Car
{
        public String modelName;
        public double mileage;

        public Car(String modelName, double mileage)
        {
            this.modelName = modelName;
            this.mileage = mileage;
        }
        @Deprecated
        public void printCarDetails()
        {
            System.out.println("Model: " + modelName + ", mileage: " + mileage);
        }
        public void getCarDetails() {
            System.out.println("Model: " + modelName);
            System.out.println("Mileage: " + mileage);
        }
}

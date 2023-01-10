

public class Car extends Transport {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    void startMoving() {
        System.out.println(" НАЧАТЬ ДВИЖЕНИЕ ");
    }

    void stopMoving() {
        System.out.println(" ЗАКОНЧИТЬ ДВИЖЕНИЕ ");
    }
}





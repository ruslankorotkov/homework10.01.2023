public class Bus extends Transport {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    void startMoving() {
        System.out.println(" НАЧАТЬ ДВИЖЕНИЕ ");
    }

    void stopMoving() {
        System.out.println(" ЗАКОНЧИТЬ ДВИЖЕНИЕ ");
    }
}

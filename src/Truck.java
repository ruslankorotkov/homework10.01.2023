import java.util.Arrays;

public class Truck extends Transport implements Competing {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving() {
        System.out.println(" НАЧАТЬ ДВИЖЕНИЕ ");
    }

    public void stopMoving() {
        System.out.println(" ЗАКОНЧИТЬ ДВИЖЕНИЕ ");
    }

    @Override
    public String[] allCompetingCommand() {
        return ALL_COMPETING_COMMANDS;
    }

    @Override
    public String toString() {
        return " ГРУЗОВИК {" +
                " МЕТОДЫ " + Arrays.toString(ALL_COMPETING_COMMANDS) +
                ", бренд '" + getBrand() + '\'' +
                ", модель " + getModel() + '\'' +
                ", объём двигателя " + getEngineVolume() +
                ", л.куб. " +
                '}';

    }
}


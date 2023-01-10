import java.util.Arrays;

public class Car extends Transport implements Competing {
    public Car(String brand, String model, double engineVolume) {
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
        return " ЛЕГКОВАЯ МАШИНА {" +
                " МЕТОДЫ " + Arrays.toString(ALL_COMPETING_COMMANDS) +
                ", бренд '" + getBrand() + '\'' +
                ", модель " + getModel() + '\'' +
                ", объём двигателя " + getEngineVolume() +
                ", л.куб. " +
                '}';
    }
}





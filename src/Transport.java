import java.util.Arrays;

public abstract class Transport implements Competing {
    public static final String PIT_STOP_COMMANDS = " Пит-стоп  ";
    public static final String BEST_LAP_TIME_COMMANDS = " Лучшее время круга ";
    public static final String MAX_SPEED_COMMANDS = "Максимальная скорость ";

    public final String[] ALL_COMPETING_COMMANDS = new String[]{PIT_STOP_COMMANDS, BEST_LAP_TIME_COMMANDS, MAX_SPEED_COMMANDS};
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String[] getALL_COMPETING_COMMANDS() {
        return ALL_COMPETING_COMMANDS;
    }

    @Override
    public String toString() {
        return " ТРАНСПОРТ {" +
                " МЕТОДЫ" + Arrays.toString(ALL_COMPETING_COMMANDS) +
                ", бренд '" + brand + '\'' +
                ", модель " + model + '\'' +
                ", объём двигателя " + engineVolume +
                ", л.куб. " +
                '}';
    }
}

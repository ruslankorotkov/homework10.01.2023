public class DriverD extends Driver{
    public DriverD(String name, String driverLicense, String experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMove() {System.out.println("Водитель категории D "+getName()+" НАЧАЛ ДВИЖЕНИЕ ");

    }

    @Override
    public void stopMove() {System.out.println("Водитель категории D "+getName()+" ОСТАНОВИЛСЯ ");
    }
    @Override
    public void refuel() {System.out.println("Водитель категории D "+getName()+" ЗАПРАВИЛ АВТО ");

    }
}
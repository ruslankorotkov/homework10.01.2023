public abstract class Driver {
    private String name;
    private String driverLicense;
    private String experience;

    public Driver(String name, String driverLicense, String experience) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "default";
        } else {
            this.name = name;
        }
        if (driverLicense == null || driverLicense.isEmpty() || driverLicense.isBlank()) {
            this.driverLicense = "default";
        } else {
            this.driverLicense = driverLicense;
        }
        if (experience == null || experience.isEmpty() || experience.isBlank()) {
            this.experience = "default";
        } else {
            this.experience = experience;
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public abstract void startMove();


    public abstract void stopMove();


    public abstract void refuel();


    @Override
    public String toString() {
        return " ВОДИТЕЛЬ:" +
                " ИМЯ: " + name +
                ", ПРАВА КАТЕГОРИИ:" + driverLicense +
                ", СТАЖ:" + experience;

    }
}




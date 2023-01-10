public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmv = new Car("BMW", "Z8", 3.0);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4);
        Bus hyundai = new Bus("Hyundai", "Avante", 1.6);
        Bus ural = new Bus("Урал", "Next", 20.22);
        Bus paz = new Bus(" Паз", "Вектор Next", 20.20);
        Bus мercedes = new Bus("Mercedes-Benz", "Tourismo", 20.21);
        Truck kamaz = new Truck("Камаз", "компас", 12.45);
        Truck zil = new Truck("Зил", "43", 24.12);
        Truck man = new Truck("Man", "TGL", 12.45);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(ural);
        System.out.println(paz);
        System.out.println(мercedes);
        System.out.println(kamaz);
        System.out.println(zil);
        System.out.println(man);

    }
}
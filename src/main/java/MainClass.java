public class MainClass {
    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", 5);
//        Plate plate = new Plate(100);
//        plate.info();
//        if (plate.getFood() - cat.getAppetite() >= 0) {
//            cat.eat();
//            plate.setFood(plate.getFood() - cat.getAppetite());
//        }
//        plate.info();
//        cat.info();

        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Тузик", 15),
                new Cat("Гоша", 20),
                new Cat("Кузя", 25),
                new Cat("Рокси", 30),
                new Cat("Чернышь", 10),
        };
        Plate plate = new Plate(100);
        plate.info();
        for (Cat cat:cats) {
            if (plate.getFood() - cat.getAppetite() >= 0) {
                cat.eat();
                plate.setFood(plate.getFood() - cat.getAppetite());
            } else {
                plate.addFood(100);
            }
            cat.info();
            plate.info();
        }
    }
}

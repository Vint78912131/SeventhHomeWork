/**
 * Lesson 7. HomeWork
 *
 * @author SotnikovVS
 * @version 22.11.2021
 *
 */
public class SeventhHomeWork {
    public static void main(String[] args) {
        Cat [] cats = {new Cat("Basik", 15),
                       new Cat("Tyson", 20),
                       new Cat("Leopold", 12),
                       new Cat("Zhan Zhack Bazilevich", 9),
                       new Cat("Porco Rosso", 11),
                       new Cat("Deamon", 9),};
        Plate plate = new Plate(20);
        feedingCats(cats,plate);
    }

    public static void feedingCats(Cat [] cats, Plate plate) {
        System.out.println("Start feeding cats:\n");
            plate.info();
            System.out.println();
        while (!areCatsFed(cats)) {
            for (Cat cat : cats) {
                if (!cat.isFed()) {
                    System.out.println(cat);
                    cat.eat(plate);
                    plate.info();
                    System.out.println();
                }
            }
            if (!areCatsFed(cats)) {
                System.out.println("The plate is full");
                plate.addFood(20);
                plate.info();
            }
            System.out.println();
        }
        System.out.println("All cats are fed!");
    }

    public static boolean areCatsFed(Cat [] cats) {
        for (Cat cat : cats) {
            if (!cat.isFed()) return false;
        }
        return true;
    }
}

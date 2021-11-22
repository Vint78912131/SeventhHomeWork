/**
 * Lesson 7. HomeWork
 *
 * @author SotnikovVS
 * @version 22.11.2021
 *
 */
public class SeventhHomeWork {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 15);
        Plate plate = new Plate(10);
        plate.info();
        cat.eat(plate);
        plate.info();
        System.out.println(cat);
    }
}

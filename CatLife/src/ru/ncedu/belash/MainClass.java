package ru.ncedu.belash;

/** Класс для реализации методов класса CatImpl
 *
 * @author Белаш М.В.
 */
public class MainClass {

    public static void main(String[] args) {
        Cat kitty = new CatImpl();
        kitty.isHungry();
        kitty.feed();
        kitty.isHungry();
        kitty.feed();
        kitty.isHungry();
    }
    
}

package ru.ncedu.belash;

/** Класс объекта Cat.
 * Голос кота - "meow", поэтому метод voice будет возвращать эту строку в консоль.
 * @param catVoise строка, в которой хранится голос кота.
 * @author Белаш М.В.
 */
public class Cat implements Voice{
    private String catVoice;

    public Cat() {
        this.catVoice = "MEOW";
    }

    public Cat(String catVoice) {
        this.catVoice = catVoice;
    }

    // Печатает в консоль голос кота.
    @Override
    public void voice() {
        System.out.println(this.catVoice);
    }
}

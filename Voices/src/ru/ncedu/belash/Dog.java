package ru.ncedu.belash;

/** Класс объекта Dog.
 * Голос собаки - "woof", поэтому метод voice будет возвращать эту строку в консоль.
 * @param dogVoise строка, в которой хранится голос собаки.
 * @author Белаш М.В.
 */
public class Dog implements Voice{
    private String dogVoice;

    public Dog() {
        this.dogVoice = "WOOF";
    }

    public Dog(String dogVoice) {
        this.dogVoice = dogVoice;
    }

    // Печатает в консоль голос собаки.
    @Override
    public void voice() {
        System.out.println(this.dogVoice);
    }
}

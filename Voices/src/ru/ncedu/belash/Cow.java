package ru.ncedu.belash;

/**Класс объекта Cow.
 * Голос кота - "moo", поэтому метод voice будет возвращать эту строку в консоль.
 * @param cowVoise строка, в которой хранится голос коровы.
 *
 * @author Белаш М.В.
 */
public class Cow implements Voice{
    private String cowVoice;
    
    public Cow() {
        this.cowVoice = "MOO";
    }

    public Cow(String cowVoice) {
        this.cowVoice = cowVoice;
    }
    // Печатает в консоль голос коровы.
    @Override
    public void voice() {
        System.out.println(this.cowVoice);
    }
    
}

package ru.ncedu.belash;

/** Основной класс, в котором тестируется примение классов Cat, Dog и Cow
 *
 * @author Белаш М.В.
 */
public class MainClass {

    public static void main(String[] args) {
        Voice[] speakable = {new Cat(), new Dog(), new Cow()};
        for (Voice speak:speakable){
            speak.voice();
        }
    }
    
}




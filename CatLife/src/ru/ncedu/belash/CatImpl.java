package ru.ncedu.belash;

/** Класс, описывающий персонажа Cat.
 *
 * @author Белаш М.В.
 */
public class CatImpl implements Cat{
    private int countFeed;
    // Метод, в котором отображается, кот поел или нет. Заодно там повышается 
    // счетчик количества вызовов этого метода.
    public CatImpl() {
        this.countFeed=0;
    }
    // Метод, который показывает, голодный кот или нет.
    public CatImpl(int countFeed) {
        this.countFeed = countFeed;
    }
    
    @Override
    public void feed() {
        this.countFeed++;
    }

    @Override
    public void isHungry() {
        if (this.countFeed==0){
            System.out.println("I’m hungry, bro!");
        } else{
            System.out.println("I just want to sleep for a bit, OK?");
        }
    }
    
}

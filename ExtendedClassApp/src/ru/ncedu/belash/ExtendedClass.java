package ru.ncedu.belash;
import java.util.Objects;

/** Класс, являющийся реализацией схемы, показанной в задании 3.
 * Здесь используются 4 параметра:
 * @param b элемент типа byte;
 * @param i элемент типа int;
 * @param d элемент типа double;
 * @param s элемент типа String.
 * Помимо этого здесь мы учимся переопределять методы equals(), hashCode() и 
 * toString().
 * 
 * @author Белаш М.В.
 */
public class ExtendedClass{
    private byte b;
    private int i;
    private double d;
    private String s;

    public ExtendedClass() {
    }

    public ExtendedClass(byte b, int i, double d, String s) {
        this.b = b;
        this.i = i;
        this.d = d;
        this.s = s;
    }
    // Возвращает элемент типа byte.
    public byte getB() {
        return b;
    }
    // Устанавливает элемент типа byte.
    public void setB(byte b) {
        this.b = b;
    }
    // Возвращает элемент типа int.
    public int getI() {
        return i;
    }
    // Устанавливает элемент типа int.
    public void setI(int i) {
        this.i = i;
    }
    // Возвращает элемент типа double.
    public double getD() {
        return d;
    }
    // Устанавливает элемент типа double.
    public void setD(double d) {
        this.d = d;
    }
    // Возвращает элемент типа String.
    public String getS() {
        return s;
    }
    // Устанавливает элемент типа String.
    public void setS(String s) {
        this.s = s;
    }
    /** Переопределенный метод equals.
    * Этот метод должен обладать свойствами рефлексивности, транзитивности,
    * симметричности, консистентности и при сравнении с элементом null должен
    * возвращать false.
    */
    @Override
    public boolean equals(Object anObject){
        if (anObject == this) {
            return true;
        }
        if (anObject == null || anObject.getClass() != this.getClass()) {
            return false;
        }

        ExtendedClass obj = (ExtendedClass) anObject;
        return (i == obj.i) && (d == obj.d) && (b == obj.b)
        && ((s == obj.s) || (s != null && s.equals(obj.getS())));
    }
    
    /** Переопределенный метод hashCode.
     * Метод hashCode() возвращает значение int (4 байта), которое является 
     * числовым представлением объекта. Этот хэш-код используется, например, 
     * коллекциями для более эффективного хранения данных и, соответственно, 
     * более быстрого доступа к ним. Для одного и того же объекта метод 
     * hashCode() должен возвращать одно и то же значение в течении 
     * всей "жизни" объекта.
     * 
     */
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((s == null) ? 0 : s.hashCode());
        result = prime * result + (int)b;
        result = prime * result + i;
        long longBits = Double.doubleToLongBits(d);
        result = 37 * result + (int)(longBits - (longBits >>> 32));
        return result;
    }
    /** Переопределенный метод toString().
     * Возвращает строку, в которой представлены все данные экземпляра класса. 
     */
    @Override
    public String toString(){
        return "b = "+this.b+"; i = "+this.i+"; d = "+this.d+"; s = "+this.s;
    }

}

package org.incorp.i;

public class Cat {

    private String name;
    private boolean full;
    private int eatNeed;

    public Cat(String name, boolean full, int eatNeed) {
        this.name = name;
        this.full = full;
        this.eatNeed = 10;
    }

    public void eat(Plate plate) {
// Коты едят если есть еда. Если нет еды не едят.
        if (plate.decrease(10)) {
            System.out.println("CAt eat...");
            full = true;
        } else {
            System.out.println("CAt NO eat...");
            full = false;
        }


    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", full=" + full +
                '}';
    }
}

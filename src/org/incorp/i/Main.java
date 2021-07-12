package org.incorp.i;

public class Main {

    public static void main(String[] args) {

        Cat[] cat = {
                new Cat("Cat1", false, 10),
                new Cat("Cat2", false, 20),
                new Cat("Cat3", false, 70),
                new Cat("Cat4", false, 30),
                new Cat("Cat5", false, 11),
                new Cat("Cat6", false, 12),
                new Cat("Cat7", false, 5),
        };
        Plate plate = new Plate(50);

for(int i= 0;i< cat.length;i++){
    cat[i].eat(plate);
}

    }
}

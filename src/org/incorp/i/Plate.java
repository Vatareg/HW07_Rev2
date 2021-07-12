package org.incorp.i;

public class Plate {
    private int food;


    public Plate(int food) {
        this.food = food;
    }

// докидываем еду когда та кончилась. Не забыть вывод на экран
    public boolean foodDrop(int amount){
        if(amount<0){
            return false;
        }
        else{
            food += amount;
            return true;
        }
    }
    // кот поел. вычетаем кол-во еды которое съел кот
    public boolean decrease(int amount){
        if(amount<0||amount>food){
            return false;
        }
        food -= amount;
        return true;
    }
}

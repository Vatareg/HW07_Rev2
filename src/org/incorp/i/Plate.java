package org.incorp.i;

public class Plate {
    private int food;


    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean foodDrop(int amount){
        if(amount<0){
            return false;
        }
        else{
            food += amount;
            return true;
        }
    }
    public boolean decrease(int amount){
        if(amount<0||amount>food){
            return false;
        }
        food -= amount;
        return true;
    }
}

package ru.geekbrains.J1.L7.hometask;

public class Cat {
    String name;
    boolean satiety;

    final int APPETITE = 10;

    public Cat(String name) {
        this.name = name;
        this.satiety = false;
    }

    public void eat(Plate plate){
        System.out.println("Cat "+ name + " eat...");
        if (plate.decreaseFood(APPETITE)){
            satiety = true;
        }
    }

    public void info(){
        System.out.println("Имя котика: " + name + ", Сытость : "+ satiety);
    }

    public void eat(Plate plate, int foodAmount){
        System.out.println("Cat "+ name + " eat...");
        if (plate.decreaseFood(foodAmount)){
            satiety = true;
        }
    }

    public void eat2(Plate plate, int foodAmount){
        System.out.println("Cat "+ name + " eat...");
        if (plate.decreaseFood2(foodAmount)){
            satiety = true;
        }
    }



    public void fear(Dog dog){
        System.out.println(name + " fear.... " + dog.name);
    }
}

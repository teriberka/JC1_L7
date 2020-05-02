package ru.geekbrains.J1.L7.hometask;

public class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void voice(Cat cat){
        System.out.println(name+ " Gav gav!!! "+ cat.name );
        cat.fear(this);
    }
}

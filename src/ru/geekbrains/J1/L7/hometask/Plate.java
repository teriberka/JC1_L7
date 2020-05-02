package ru.geekbrains.J1.L7.hometask;

public class Plate {
    private int food;
//    private boolean satiety;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Food : "+ food);
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int amount) {
        if (amount > food) {
            food = 0;
            System.out.println("Еды в тарелке меньше чем животное хочет сьесть. Тарелка пуста!");
            return false;
        }
        System.out.println("Еды в тарелке достаточно!");
        food -= amount;
        return true;
    }

    public boolean decreaseFood2(int amount) {
        if (amount > food) {
            System.out.println("Еды в тарелке недостаочно, согласно логике 4 задания, кот не трогает то что есть и остается голодным!");
            return false;
        }
        System.out.println("Еды в тарелке достаточно!");
        food -= amount;
        return true;
    }

    public void addFood(int amount){
        food += amount;
    }
}

package ru.geekbrains.J1.L7.hometask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik");
//        Plate plate = new Plate(100);
//        cat.eat(plate);
//        plate.info();

//        2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
//        (например, в миске 10 еды, а кот пытается покушать 15-20)
        Cat cat = new Cat("Barsik");
        Plate plate = new Plate(30);
        cat.eat(plate, 20);
        cat.info();
        plate.info();

//        3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
//        Если коту удалось покушать (хватило еды), сытость = true
        Cat cat2 = new Cat("Barsik2");
        cat2.eat(plate, 15);
        cat2.info();
        plate.info();

//        4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,
//        то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
        Cat cat3 = new Cat("Barsik3");
//        6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
        plate.addFood(15);
        plate.info();
        cat3.eat2(plate, 20);
        cat3.info();
        plate.info();

        // 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
        // и потом вывести информацию о сытости котов в консоль
        Cat cat4 = new Cat("Barsik4");
        Cat cat5 = new Cat("Barsik5");
        plate.addFood(25);
        plate.info();

        Cat[] arrCats = new Cat[5];
        arrCats[0] = cat;
        arrCats[1] = cat2;
        arrCats[2] = cat3;
        arrCats[3] = cat4;
        arrCats[4] = cat5;

        for (int i = 0; i < arrCats.length; i++){
            arrCats[i].eat(plate,10);
            arrCats[i].info();
            plate.info();
        }

//        Dog dog = new Dog("Tuzik");
//        dog.voice(cat);

    }
}

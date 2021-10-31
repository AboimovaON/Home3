package com.company;



public class Main {

    public static void main(String[] args) {
        //1. Написать метод, который меняет два элемента массива местами
        // (массив может быть любого ссылочного типа);

        String[] job = {"Без труда ", " не выловишь ", " рыбку ", " из пруда"};
        for (int i = 0; i < job.length; i++) {
            System.out.print(job[i]);
        }
        System.out.println();

        int n = job.length;
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = job[n - i - 1];
            job[n - i - 1] = job[i];
            job[i] = temp;
        }
        for (int i = 0; i < job.length; i++) {
            System.out.print(job[i]);
        }
        System.out.println();

        //2. Задача:
        //Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        //Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
        // поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        //Для хранения фруктов внутри коробки можно использовать ArrayList;
        //Сделать метод getWeight(), который высчитывает вес коробки, зная вес
        // одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        //Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
        // которую подадут в compare() в качестве параметра. true – если их массы равны,
        // false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
        //Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        // Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        // Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты,
        // которые были в первой;
        //Не забываем про метод добавления фрукта в коробку.

        Box<Apple> box = new Box();
        box.add(new Apple());
        box.add(new Apple());
        box.add(new Apple());

        Box<Orange> box1 = new Box();
        box1.add(new Orange());
        box1.add(new Orange());
        box1.add(new Orange());

        Box<Apple> box2 = new Box();
        box2.add(new Apple());
        box2.add(new Apple());
        box2.add(new Apple());

        Box<Orange> box4 = new Box();
        box4.add(new Orange());
        box4.add(new Orange());
        box4.add(new Orange());

        System.out.println(box.Compare(box1));
        System.out.println(box.Compare(box2));
        System.out.println(box.Compare(box4));
    }
}
























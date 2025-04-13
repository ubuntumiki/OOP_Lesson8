//Завдання 5
//Використовуючи Intelij IDEA, створити проект, пакет.
// Створити клас Animal з ім'ям String, int віком, хвостом Boolean.
// У класі перевизначити метод toString,
// щоб висновок був наступним «Ім'я: Васька, вік: 45, хвіст: ні».
// У класі Animal перевизначити методи equals & hashCode.

package com.example.task05;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Animal("Picur", 8, true);
        Animal cat2 = new Animal("Vasyka", 45, false);
        Animal dog = new Animal("Tuzik", 15, false);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(dog);
        System.out.println("----------------------------------");
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(dog));
        System.out.println("----------------------------------");
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(dog.hashCode());
    }
}

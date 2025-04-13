//OOP. 1
//Поля
//Найменування
//Кількість
//Ціна
//Виробник
//Дата_надходження_на_склад
//Визначити кількість усіх товарів,
//кількість яких більша за 5 і вивести відомості про ці товари.

package com.example.practice.task1;

import java.util.ArrayList;

public class Main implements FilterProduct, TotalCount {
    ArrayList<Product> arrProduct = new ArrayList<>();

    public static void main(String[] args) {
        Product product1 = new Product("Phone", 7, 24_000, "Samsung", 2025);
        Product product2 = new Product("Notebook", 17, 44_000, "Asus", 2025);
        Product product3 = new Product("Monitor", 4, 14_000, "BenQ", 2025);
        Product product4 = new Product("Printer", 10, 17_000, "Canon", 2025);
        Product product5 = new Product("Scaner", 3, 7_000, "Mustek", 2025);

        Main main = new Main();

        main.arrProduct.add(product1);
        main.arrProduct.add(product2);
        main.arrProduct.add(product3);
        main.arrProduct.add(product4);
        main.arrProduct.add(product5);

        System.out.println("кількість усіх товарів: " + main.getTotalCount());
        System.out.println("кількість яких більша за 5: " + main.findProduct());
    }

    @Override
    public ArrayList<Product> findProduct() {
        ArrayList<Product> result = new ArrayList<>();
        for (Product temp : arrProduct){
            if (temp.getCount() > 5){
                result.add(temp);
            }
        }
        return result;
    }

    @Override
    public int getTotalCount() {
        int count = 0;
        for (int i = 0; i < arrProduct.size(); i++) {
            count += arrProduct.get(i).getCount();
        }
        return count;
    }
}

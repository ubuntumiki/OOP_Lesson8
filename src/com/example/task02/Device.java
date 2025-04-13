//Завдання 2
//Створити класи:
//1) Основний клас Device (manufacturer(String), price(float), serialNumber(String));
//2) Сабклас Monitor (resolutionX(int), resolutionY(int))
// і EthernetAdapter (speed(int), mac(String)); Додати методи доступу. Конструктор.

package com.example.task02;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

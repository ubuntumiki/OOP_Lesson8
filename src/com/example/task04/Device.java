//Завдання 4
//Подивитися завдання 2.
//Перевизначити методи equals & hashCode у кожному класі.
//Створити клас Main, де створити об'єкти класів і продемонструвати перевизначені методи.

package com.example.task04;

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

    @Override
    public String toString() {
        return "Device: " +
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj == null){
            return false;
        }

        if (getClass() != obj.getClass()){
            return false;
        }

        Device other = (Device) obj;

        return manufacturer.equals(other.manufacturer) &&
                Float.compare(price, other.price) == 0 &&
                serialNumber.equals(other.serialNumber);
    }

    public int hashCode(){
        return java.util.Objects.hash(manufacturer, price, serialNumber);
    }
}

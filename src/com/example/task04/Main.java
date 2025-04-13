package com.example.task04;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        Device device2 = new Device("Samsung", 120, "AB1234567CD");

        Monitor monitor1 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Monitor monitor2 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);

        EthernetAdapter adapter1 = new EthernetAdapter("TP-Link", 35.5f, "CD9876543EF", 1000, "00:1A:2B:3C:4D:5E");
        EthernetAdapter adapter2 = new EthernetAdapter("TP-Link", 35.5f, "CD9876543EF", 1000, "00:1A:2B:3C:4D:5E");

        System.out.println("device1.equals(device2): " + device1.equals(device2));
        System.out.println("monitor1.equals(monitor2): " + monitor1.equals(monitor2));
        System.out.println("adapter1.equals(adapter2): " + adapter1.equals(adapter2));

        System.out.println("device1.hashCode(): " + device1.hashCode());
        System.out.println("device2.hashCode(): " + device2.hashCode());

        System.out.println("monitor1.toString(): " + monitor1);
        System.out.println("adapter1.toString(): " + adapter1);
    }
}

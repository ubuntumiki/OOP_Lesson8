package com.example.task04;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString().replace("Device: ", "Ethernet Adapter: ") +
                ", speed=" + speed +
                ", mac=" + mac;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        EthernetAdapter other = (EthernetAdapter) obj;
        return speed == other.speed &&
                mac.equals(other.mac);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), speed, mac);
    }
}

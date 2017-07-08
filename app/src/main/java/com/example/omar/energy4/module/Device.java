package com.example.omar.energy4.module;

/**
 * Created by Lincoln on 18/05/16.
 */
public class Device {
    private String name;
    private int KWA;
    private int deviceImage;
    private String stutas;

    public Device() {
    }

    public Device(String name, int KWA, int deviceImage) {
        this.name = name;
        this.KWA = KWA;
        this.deviceImage = deviceImage;
        this.stutas = stutas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKWA() {
        return KWA;
    }

    public void setKWA(int KWA) {
        this.KWA = KWA;
    }

    public int getDeviceImage() {
        return deviceImage;
    }

    public void setDeviceImage(int deviceImage) {
        this.deviceImage = deviceImage;
    }
}

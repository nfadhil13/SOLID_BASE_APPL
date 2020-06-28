package models;

import interfaces.IShape;

public class Rectangle implements IShape {
    @Override
    public String draw() {
        return "Menggambar persegi panjang";
    }
}

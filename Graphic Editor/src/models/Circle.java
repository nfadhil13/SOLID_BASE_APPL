package models;

import interfaces.IShape;

public class Circle implements IShape {
    @Override
    public String draw() {
        return "menggambar lingkaran";
    }
}

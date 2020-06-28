package models;

import interfaces.IShape;

public class Square implements IShape {

    @Override
    public String draw() {
        return "Menggambar persegi";
    }
}

package models;

import interfaces.IShape;

public class GraphicEditor {

    public void drawShape(IShape shape){
        System.out.println(shape.draw());
    }
}

import models.Circle;
import models.GraphicEditor;
import models.Rectangle;
import models.Square;

public class main {

    public static void main(String args[]){

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square  square = new Square();

        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(circle);
        graphicEditor.drawShape(rectangle);
        graphicEditor.drawShape(square);

    }
}

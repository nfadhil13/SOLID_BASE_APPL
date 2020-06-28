import java.util.List;

public class Manager extends Employee {

    List<String> documents;

    public Manager(String name , List<String> documentsList) {
        super(name);
        documents = documentsList;
    }

    @Override
    public String toString() {
        return super.toString() + " , Document : " + documents.toString();
    }
}

package models;

import interfaces.IStreamable;

public class File implements IStreamable {


    private String name;
    private int length;
    private int byteSent;

    public File(String name, int length, int byteSent) {
        this.name = name;
        this.length = length;
        this.byteSent = byteSent;
    }


    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public int getByteSent() {
        return this.byteSent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setByteSent(int byteSent) {
        this.byteSent = byteSent;
    }
}

package models;

import interfaces.IStreamable;

public class StreamProgressInfo {
    private IStreamable file;

    public StreamProgressInfo(IStreamable file){
        this.file = file;
    }

    public int CalculateCurrentPercent(){
        return file.getByteSent() / file.getLength() *100;
    }
}

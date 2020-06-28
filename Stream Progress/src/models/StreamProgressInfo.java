package models;

import interfaces.IStreamable;

public class StreamProgressInfo {
    private IStreamable file;

    public StreamProgressInfo(IStreamable file){
        this.file = file;
    }

    public double CalculateCurrentPercent(){
        return (double)file.getByteSent() / (double)file.getLength() *100;
    }
}

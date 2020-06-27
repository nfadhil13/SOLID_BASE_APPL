package models;

import interfaces.IStreamable;

public class Music implements IStreamable {

    private String artist;
    private String album;
    private int length;
    private int byteSent;

    public Music(String artist, String album) {
        this.artist = artist;
        this.album = album;

    }

    public Music(String artist, String album, int length, int byteSent) {
        this.artist = artist;
        this.album = album;
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

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setByteSent(int byteSent) {
        this.byteSent = byteSent;
    }
}

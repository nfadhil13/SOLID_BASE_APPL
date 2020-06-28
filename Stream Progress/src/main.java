import models.File;
import models.Music;
import models.StreamProgressInfo;

public class main {

    public static void main(String args[]){
        File file = new File("File Test", 100 , 43);
        Music music = new Music("Ismi AlaTukin" , "Album Sejagat", 98 , 5);

        StreamProgressInfo fileProgressInfo = new StreamProgressInfo(file);
        StreamProgressInfo musicProgressInfo = new StreamProgressInfo(music);

        System.out.println("File progress : "  + fileProgressInfo.CalculateCurrentPercent() + "%");
        System.out.println("Music Progress : " + musicProgressInfo.CalculateCurrentPercent() + "%");
    }
}

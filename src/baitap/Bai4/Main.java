package baitap.Bai4;

public class Main {
    public static void main(String[] args) {
        Adapter adapter1 = new Adapter();
        adapter1.play("Mp4", "videoMp4");
        adapter1.play("Vlc", "audioVLc");
        adapter1.play("Mp3", "audioMp3");
    }
}

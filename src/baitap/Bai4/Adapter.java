package baitap.Bai4;

public class Adapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;
    public Adapter(){
        advancedMediaPlayer = new AdvancedMediaPlayer();
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        }else {
            System.out.println("Không hỗ trợ file âm thanh này");
        }
    }
}

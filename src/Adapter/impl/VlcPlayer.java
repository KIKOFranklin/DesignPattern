package Adapter;

/**
 * @author KIKOFranklin
 * @create 2021/4/5 0005 14:05
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) { }
}

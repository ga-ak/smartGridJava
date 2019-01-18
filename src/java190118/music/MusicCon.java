package java190118.music;

import javazoom.jl.player.MP3Player;

import java.util.ArrayList;

public class MusicCon {

    MP3Player mp3 = new MP3Player();
    ArrayList<MusicVO> musicList = new ArrayList<>();
    int index;


    public MusicCon() {
        musicList.add(new MusicVO("빅뱅", "뱅뱅뱅", "/Users/cheolho/Programing/music/bangbangbang.mp3"));
        musicList.add(new MusicVO("쇼미더머니4", "오빠차 뽀바따", "/Users/cheolho/Programing/music/brothercar.mp3"));
        musicList.add(new MusicVO("트와이스", "cheerup", "/Users/cheolho/Programing/music/cheerup.mp3"));
    }

    public MusicVO play(int index) {
        this.index = index;
        if (mp3.isPlaying()) {
            mp3.stop();
        }
        if (index < 0 || index >= musicList.size()) {

            return null;
        } else {
            mp3.play(musicList.get(index).getPath());

            if (mp3.isPlaying()) {
                return musicList.get(index);
            }
        }
        return null;
    }

    public MusicVO stop() {
        if (mp3.isPlaying()) {
            stop();
            return musicList.get(this.index);
        }
        return null;
    }


}

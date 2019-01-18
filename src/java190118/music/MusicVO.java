package java190118.music;

public class MusicVO {
    private String singer;
    private String musicName;
    private String path;

    @Override
    public String toString() {
        return this.singer+" - "+this.musicName;
    }

    public MusicVO(String singer, String musicName, String path) {
        this.singer = singer;
        this.musicName = musicName;
        this.path = path;
    }

    public String getSinger() {
        return singer;
    }

    public String getMusicName() {
        return musicName;
    }

    public String getPath() {
        return path;
    }


}

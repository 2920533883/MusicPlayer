package DataBase;

public class Music {
    String musicName;
    String singer;

    public Music(String musicName, String singer) {
        this.musicName = musicName;
        this.singer = singer;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Music{" +
                "musicName='" + musicName + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}

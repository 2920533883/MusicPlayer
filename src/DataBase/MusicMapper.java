package DataBase;

import java.util.List;

public interface MusicMapper {
    public void insertMusic(Music music);

    public List<Music> getMusic();
}

package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    // IoC
    /*
        public MusicPlayer(Music music) {
        this.music = music;
    }
     */

    public MusicPlayer() {}

    /*
        public void setMusic(Music music) {
        this.music = music;
    }
     */

    public void playMusic() {
        for (Music iterator:
             musicList) {
            System.out.println("Playing: " + iterator.getSong());
        }
    }
}

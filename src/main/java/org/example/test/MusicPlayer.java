package org.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    private List<Music> musicList;

    // инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
        musicList = new ArrayList<>();
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

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

    public void playMusic() {
        System.out.println("playing: " + music.getSong());
    }

    public void playMusics() {
        System.out.print("Playing: ");
        for (int i = 0; i < musicList.size(); i++) {
            System.out.print(musicList.get(i).getSong());
            if (i < musicList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

package org.example.test.Musics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayerAnn musicPlayerAnn;

    @Autowired
    public Computer(MusicPlayerAnn musicPlayerAnn) {
        this.id = 1;
        this.musicPlayerAnn = musicPlayerAnn;
    }

    @Override
    public String toString() {
        return "Computer " + id + " is " + musicPlayerAnn.playMusic(Genres.ROCK);
    }
}

package org.example.test.Musics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerAnn {
    @Value("${musicPlayerAnn.name}")
    private String name;
    @Value("${musicPlayerAnn.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayerAnn(@Qualifier("classicalMusicAnnotation") Music music1,
                          @Qualifier("rockMusicAnnotation") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    //    public MusicPlayerAnn(Music music) {
//        this.music = music;
//    }
//
//    @Autowired
////    теперь можно любое название
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String playMusic(Genres genres) {
        if (genres.equals(Genres.CLASSICAL)) {
            return "playing: " + music1.getSong();
        } else if (genres.equals(Genres.ROCK)) {
            return "playing: " + music2.getSong();
        }
        return "";
    }
}

enum Genres {
    CLASSICAL,
    ROCK
}

package org.example.test.Musics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class MusicPlayerAnn {
//    @Value("${musicPlayerAnn.name}")
//    private String name;
//    @Value("${musicPlayerAnn.volume}")
//    private int volume;

//    public String getName() {
//        return name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }


    private List<Music> list;


//    private Music music1;
//    private Music music2;

    //    @Autowired
    public MusicPlayerAnn(List<Music> list) {
        this.list = list;
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

//    public String playMusic(Genres genres) {
//        if (genres.equals(Genres.CLASSICAL)) {
//            return "playing: " + music1.getSong();
//        } else if (genres.equals(Genres.ROCK)) {
//            return "playing: " + music2.getSong();
//        }
//        return "";
//    }

    public String playMusic() {
        int i = (int) (Math.random() * list.size());
        return "playing: " + list.get(i).getSong();
    }
}

enum Genres {
    CLASSICAL,
    ROCK
}

package org.example.test.Musics;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusicAnnotation implements Music {
    List<String> list;

    public RockMusicAnnotation() {
        list = new ArrayList<>();
        list.add("rock music 1");
        list.add("rock music 2");
        list.add("rock music 3");
    }

    @Override
    public String getSong() {
        int i = (int) (Math.random() * list.size());
        return list.get(i);
    }


}

package org.example.test.Musics;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component

public class ClassicalMusicAnnotation implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("classical init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("classical destroy");
    }

    List<String> list;

    public ClassicalMusicAnnotation() {
        list = new ArrayList<>();
        list.add("classical music 1");
        list.add("classical music 2");
        list.add("classical music 3");
    }


    @Override
    public String getSong() {
        int i = (int) (Math.random() * list.size());
        return list.get(i);
    }


}

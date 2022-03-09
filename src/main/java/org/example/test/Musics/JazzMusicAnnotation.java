package org.example.test.Musics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

//@Component
public class JazzMusicAnnotation implements Music {
//    @PostConstruct
//    public void doMyInit() {
//        System.out.println("jazz init");
//    }
//
//    @PreDestroy
//    public void doMyDestroy() {
//        System.out.println("jazz destroy");
//    }

    List<String> list;

    public JazzMusicAnnotation() {
        list = new ArrayList<>();
        list.add("jazz music 1");
        list.add("jazz music 2");
        list.add("jazz music 3");
    }


    @Override
    public String getSong() {
        int i = (int) (Math.random() * list.size());
        return list.get(i);
    }


}

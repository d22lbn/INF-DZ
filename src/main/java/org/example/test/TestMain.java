package org.example.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        MusicPlayer musicPlayer2 = context.getBean("musicPlayerBeansConstr", MusicPlayer.class);
        musicPlayer2.playMusics();
        System.out.println();
        MusicPlayer musicPlayer3 = context.getBean("musicPlayerBeansSetter", MusicPlayer.class);
        musicPlayer3.playMusics();


        context.close();
    }
}

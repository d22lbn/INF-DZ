package org.example.test;

import org.example.test.Musics.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");


//        через java класс
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

//        MusicPlayer musicPlayer2 = context.getBean("musicPlayerBeansConstr", MusicPlayer.class);
//        musicPlayer2.playMusics();
//        System.out.println();
//        MusicPlayer musicPlayer3 = context.getBean("musicPlayerBeansSetter", MusicPlayer.class);
//        musicPlayer3.playMusics();


//        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
//        MusicPlayer player2 = context.getBean("musicPlayerBean", MusicPlayer.class);
//
////        сравниваем по ссылке
//        boolean comparison = player == player2;
//        System.out.println(comparison);
//
////        метод выведет хеш объектов, так как toString() не переопределен
//        System.out.println(player);
//        System.out.println(player2);
//
//        player.setVolume(10);
//
//        System.out.println(player.getVolume() + " v " + player2.getVolume());


//        ClassicalMusic classicalMusic = context.getBean("musicBeanClassical", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("musicBeanClassical", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
//        System.out.println("--------------");
//        RockMusic rockMusic = context.getBean("musicBeanRock", RockMusic.class);
//        RockMusic rockMusic2 = context.getBean("musicBeanRock", RockMusic.class);
//        System.out.println(rockMusic.getSong());


//        JassMusic jassMusic = new JassMusic();


//        System.out.println("-------------");
//        JazzMusic jazzMusic = context.getBean("musicBeanJazz", JazzMusic.class);
//        JazzMusic jazzMusic2 = context.getBean("musicBeanJazz", JazzMusic.class);
//        JazzMusic jazzMusic3 = context.getBean("musicBeanJazz", JazzMusic.class);
//        System.out.println(jazzMusic.getSong());


//        ClassicalMusicAnnotation musicAnnotation = context.getBean(
//                "classicalMusicAnnotation", ClassicalMusicAnnotation.class);
//        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//        musicPlayer.playMusic();


//        MusicPlayerAnn musicPlayerAnn = context.getBean("musicPlayerAnn", MusicPlayerAnn.class);
//        musicPlayerAnn.playMusic();


//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer.toString());


//        MusicPlayerAnn playerAnn = context.getBean("musicPlayerAnn", MusicPlayerAnn.class);
//        System.out.println(playerAnn.getName() + " " + playerAnn.getVolume());

//        ClassicalMusicAnnotation music1 = context.getBean(
//                "classicalMusicAnnotation", ClassicalMusicAnnotation.class);

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer.toString());


        context.close();
    }
}

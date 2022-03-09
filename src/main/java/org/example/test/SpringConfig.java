package org.example.test;

import org.example.test.Musics.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("org.example.test")
@PropertySource("classpath:musicPlayerAnn.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusicAnnotation classicalMusicAnnotation() {
        return new ClassicalMusicAnnotation();
    }

    @Bean
    public RockMusicAnnotation rockMusicAnnotation() {
        return new RockMusicAnnotation();
    }

    @Bean
    public JazzMusicAnnotation jazzMusicAnnotation() {
        return new JazzMusicAnnotation();
    }

    @Bean
    public List<Music> list() {
        return Arrays.asList(classicalMusicAnnotation(), rockMusicAnnotation(), jazzMusicAnnotation());
    }

    @Bean
    public MusicPlayerAnn musicPlayerAnn() {
        return new MusicPlayerAnn(list());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayerAnn());
    }

}

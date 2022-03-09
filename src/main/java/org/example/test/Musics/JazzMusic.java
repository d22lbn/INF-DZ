package org.example.test.Musics;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "jazz music";
    }


    //    для фабричного метода. Теперь не получится создать через new

    private JazzMusic() {}
    public static JazzMusic getJazzMusic() {
        return new JazzMusic();
    }
}

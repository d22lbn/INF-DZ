package org.example.test.Musics;

public class ClassicalMusic implements Music {
    public void doMyInit() {
        System.out.println("bean init ClassicalMusic!");
    }
    public void doMyDestroy() {
        System.out.println("bean destroy ClassicalMusic!");
    }

    @Override
    public String getSong() {
        return "classical music";
    }


}

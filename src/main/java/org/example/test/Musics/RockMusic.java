package org.example.test.Musics;

public class RockMusic implements Music {

    public void doMyInit() {
        System.out.println("bean init RockMusic!");
    }

    public void doMyDestroy() {
        System.out.println("bean destroy RockMusic!");
    }


    @Override
    public String getSong() {
        return "rock music";
    }
}

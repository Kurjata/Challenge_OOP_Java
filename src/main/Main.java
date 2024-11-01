package main;

import models.MyFavorites;
import models.Music;
import models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Like a Stone");
        myMusic.setSinger("AudioSlave");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("AudioSlave");
        myPodcast.setHost("Felipe Kurjata");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.add(myPodcast);
        favorites.add(myMusic);
    }
}

package Adapter;

import java.sql.SQLOutput;

public class PlayingMusic {
    public static void main(String[] args) {
        IHeadphone androidHeadphone = new AndroidHeadphones();
        IHeadphone iphoneHeadphone = new IphoneHeadphones();

        System.out.println("iphone headphones with an android phone:\n");
        IHeadphone adapterForAndroid = new JackAdapter(iphoneHeadphone);
        adapterForAndroid.playMusic();
        System.out.println("-------------------------------------------");
        System.out.println("android headphones with an iphone phone:\n");
        IHeadphone adapterForIphone = new JackAdapter(androidHeadphone);
        adapterForIphone.playMusic();

    }
}

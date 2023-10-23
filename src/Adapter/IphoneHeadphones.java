package Adapter;

public class IphoneHeadphones implements IHeadphone{
    @Override
    public void playMusic() {
        System.out.println("Playing the music through iphone Headphones");
    }
}
